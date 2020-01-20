package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Advertisement;
import com.dtkq.api.entity.Case;
import com.dtkq.api.service.AdvertisementService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Advertisement)表控制层
 *
 * @author makejava
 * @since 2019-08-16 14:07:47
 */
@RestController
@RequestMapping("advertisement")
public class AdvertisementController {
    /**
     * 服务对象
     */
    @Resource
    private AdvertisementService service;
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Advertisement selectOne(Integer id) {
        return this.service.queryById(id);
    }

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody Advertisement entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }

        List<Advertisement> list =service.queryAll(entity);
        Integer countNum =service.countNum(entity);
        /*List<ArticleComment> list =service.queryAllByLimit(entity);*/
        JSONObject jsonObject=new JSONObject();//组成一个对象
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("countNum",countNum);//总数据
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }



    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody Advertisement entity) {
        service.insert(entity);
        if (entity.getId() != null) {
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody Advertisement entity) {
        if (entity.getId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody Advertisement entity) {
        if (entity.getId() != null) {
            service.deleteById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody Advertisement entity) {
        if (entity.getId() != null) {
            Advertisement obj=service.queryById(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }

    //  前台查看单个文章并且增加浏览量
    @RequestMapping("/addClick")
    public Map<String, Object> webFindObj(@RequestBody Advertisement entity) {
        if (entity.getId() != null) {
            //增加浏览量
            boolean rs=service.addNum(entity.getId()); //引用DAO 层开始操作数据库
            //增加浏览量 --结束
            if(rs){
                return re.SUCCESS();
            }
        }
        return re.ERROR();
    }

}