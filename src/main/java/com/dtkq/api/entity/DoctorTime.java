package com.dtkq.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class DoctorTime implements Serializable {

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_time.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_time.doctor_id
     *
     * @mbg.generated
     */
    private Integer doctorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_time.startTime
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_time.endTime
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_time.book_Max
     *
     * @mbg.generated
     */
    private Integer bookMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_time.ctime
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_time.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doctor_time
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_time.id
     *
     * @return the value of doctor_time.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_time.id
     *
     * @param id the value for doctor_time.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_time.doctor_id
     *
     * @return the value of doctor_time.doctor_id
     *
     * @mbg.generated
     */
    public Integer getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_time.doctor_id
     *
     * @param doctorId the value for doctor_time.doctor_id
     *
     * @mbg.generated
     */
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_time.startTime
     *
     * @return the value of doctor_time.startTime
     *
     * @mbg.generated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_time.startTime
     *
     * @param starttime the value for doctor_time.startTime
     *
     * @mbg.generated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_time.endTime
     *
     * @return the value of doctor_time.endTime
     *
     * @mbg.generated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_time.endTime
     *
     * @param endtime the value for doctor_time.endTime
     *
     * @mbg.generated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_time.book_Max
     *
     * @return the value of doctor_time.book_Max
     *
     * @mbg.generated
     */
    public Integer getBookMax() {
        return bookMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_time.book_Max
     *
     * @param bookMax the value for doctor_time.book_Max
     *
     * @mbg.generated
     */
    public void setBookMax(Integer bookMax) {
        this.bookMax = bookMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_time.ctime
     *
     * @return the value of doctor_time.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_time.ctime
     *
     * @param ctime the value for doctor_time.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_time.status
     *
     * @return the value of doctor_time.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_time.status
     *
     * @param status the value for doctor_time.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_time
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
        sb.append(", doctorId=").append(doctorId);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", bookMax=").append(bookMax);
        sb.append(", ctime=").append(ctime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}