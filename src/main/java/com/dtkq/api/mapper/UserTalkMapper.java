package com.dtkq.api.mapper;

import com.dtkq.api.entity.UserTalk;
import java.util.List;

public interface UserTalkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_talk
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_talk
     *
     * @mbg.generated
     */
    int insert(UserTalk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_talk
     *
     * @mbg.generated
     */
    UserTalk selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_talk
     *
     * @mbg.generated
     */
    List<UserTalk> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_talk
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserTalk record);
}