package com.dtkq.api.entity;

import java.io.Serializable;
import java.util.Date;

public class AskComment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.ask_answer_id
     *
     * @mbg.generated
     */
    private Integer askAnswerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ask_comment.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ask_comment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.id
     *
     * @return the value of ask_comment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.id
     *
     * @param id the value for ask_comment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.ask_answer_id
     *
     * @return the value of ask_comment.ask_answer_id
     *
     * @mbg.generated
     */
    public Integer getAskAnswerId() {
        return askAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.ask_answer_id
     *
     * @param askAnswerId the value for ask_comment.ask_answer_id
     *
     * @mbg.generated
     */
    public void setAskAnswerId(Integer askAnswerId) {
        this.askAnswerId = askAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.parent_id
     *
     * @return the value of ask_comment.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.parent_id
     *
     * @param parentId the value for ask_comment.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.level
     *
     * @return the value of ask_comment.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.level
     *
     * @param level the value for ask_comment.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.user_id
     *
     * @return the value of ask_comment.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.user_id
     *
     * @param userId the value for ask_comment.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.ctime
     *
     * @return the value of ask_comment.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.ctime
     *
     * @param ctime the value for ask_comment.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.status
     *
     * @return the value of ask_comment.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.status
     *
     * @param status the value for ask_comment.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ask_comment.content
     *
     * @return the value of ask_comment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ask_comment.content
     *
     * @param content the value for ask_comment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ask_comment
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", askAnswerId=").append(askAnswerId);
        sb.append(", parentId=").append(parentId);
        sb.append(", level=").append(level);
        sb.append(", userId=").append(userId);
        sb.append(", ctime=").append(ctime);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}