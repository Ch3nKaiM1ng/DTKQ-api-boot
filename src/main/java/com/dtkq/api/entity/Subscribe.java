package com.dtkq.api.entity;

import java.io.Serializable;
import java.util.Date;

public class Subscribe implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscribe.s_id
     *
     * @mbg.generated
     */
    private Integer sId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscribe.d_id
     *
     * @mbg.generated
     */
    private Integer dId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscribe.s_name
     *
     * @mbg.generated
     */
    private String sName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscribe.s_phone
     *
     * @mbg.generated
     */
    private String sPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscribe.s_date
     *
     * @mbg.generated
     */
    private String sDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscribe.s_time
     *
     * @mbg.generated
     */
    private String sTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subscribe.s_addTime
     *
     * @mbg.generated
     */
    private Date sAddtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subscribe
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscribe.s_id
     *
     * @return the value of subscribe.s_id
     *
     * @mbg.generated
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscribe.s_id
     *
     * @param sId the value for subscribe.s_id
     *
     * @mbg.generated
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscribe.d_id
     *
     * @return the value of subscribe.d_id
     *
     * @mbg.generated
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscribe.d_id
     *
     * @param dId the value for subscribe.d_id
     *
     * @mbg.generated
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscribe.s_name
     *
     * @return the value of subscribe.s_name
     *
     * @mbg.generated
     */
    public String getsName() {
        return sName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscribe.s_name
     *
     * @param sName the value for subscribe.s_name
     *
     * @mbg.generated
     */
    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscribe.s_phone
     *
     * @return the value of subscribe.s_phone
     *
     * @mbg.generated
     */
    public String getsPhone() {
        return sPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscribe.s_phone
     *
     * @param sPhone the value for subscribe.s_phone
     *
     * @mbg.generated
     */
    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscribe.s_date
     *
     * @return the value of subscribe.s_date
     *
     * @mbg.generated
     */
    public String getsDate() {
        return sDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscribe.s_date
     *
     * @param sDate the value for subscribe.s_date
     *
     * @mbg.generated
     */
    public void setsDate(String sDate) {
        this.sDate = sDate == null ? null : sDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscribe.s_time
     *
     * @return the value of subscribe.s_time
     *
     * @mbg.generated
     */
    public String getsTime() {
        return sTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscribe.s_time
     *
     * @param sTime the value for subscribe.s_time
     *
     * @mbg.generated
     */
    public void setsTime(String sTime) {
        this.sTime = sTime == null ? null : sTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subscribe.s_addTime
     *
     * @return the value of subscribe.s_addTime
     *
     * @mbg.generated
     */
    public Date getsAddtime() {
        return sAddtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subscribe.s_addTime
     *
     * @param sAddtime the value for subscribe.s_addTime
     *
     * @mbg.generated
     */
    public void setsAddtime(Date sAddtime) {
        this.sAddtime = sAddtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subscribe
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", dId=").append(dId);
        sb.append(", sName=").append(sName);
        sb.append(", sPhone=").append(sPhone);
        sb.append(", sDate=").append(sDate);
        sb.append(", sTime=").append(sTime);
        sb.append(", sAddtime=").append(sAddtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}