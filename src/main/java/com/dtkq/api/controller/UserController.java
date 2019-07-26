package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.User;
import com.dtkq.api.service.UserService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:25:16
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.service.queryById(id);
    }
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody User entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        entity.setOffset(currpage-1);
        List<User> list =service.queryAll(entity);
        /*List<ArticleComment> list =service.queryAllByLimit(entity);*/
        JSONObject jsonObject=new JSONObject();//组成一个对象
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }
    @RequestMapping("/findOurList")
    public Map<String, Object> findOurList() {
        User entity =new User();
        entity.setLimit(5000);
        entity.setOffset(0);
        entity.setAuth(1);
        List<User> list =service.queryAll(entity);
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody User entity) {
        service.insert(entity);
        if (entity.getUserId() != null) {
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody User entity) {
        if (entity.getUserId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody User entity) {
        if (entity.getUserId() != null) {
            service.deleteById(entity.getUserId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody User entity) {
        if (entity.getUserId() != null) {
            User obj=service.queryById(entity.getUserId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}