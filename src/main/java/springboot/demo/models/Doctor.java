package springboot.demo.models;

import java.io.Serializable;
import java.util.Date;

public class Doctor implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_id
     *
     * @mbg.generated
     */
    private Integer doctorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.class_id
     *
     * @mbg.generated
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_ch_name
     *
     * @mbg.generated
     */
    private String doctorChName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_en_name
     *
     * @mbg.generated
     */
    private String doctorEnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_ch_position
     *
     * @mbg.generated
     */
    private String doctorChPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_en_position
     *
     * @mbg.generated
     */
    private String doctorEnPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_introduction
     *
     * @mbg.generated
     */
    private String doctorIntroduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_img
     *
     * @mbg.generated
     */
    private String doctorImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_sex
     *
     * @mbg.generated
     */
    private Integer doctorSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_mobile
     *
     * @mbg.generated
     */
    private String doctorMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_email
     *
     * @mbg.generated
     */
    private String doctorEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doctor
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_id
     *
     * @return the value of doctor.doctor_id
     *
     * @mbg.generated
     */
    public Integer getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_id
     *
     * @param doctorId the value for doctor.doctor_id
     *
     * @mbg.generated
     */
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.class_id
     *
     * @return the value of doctor.class_id
     *
     * @mbg.generated
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.class_id
     *
     * @param classId the value for doctor.class_id
     *
     * @mbg.generated
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_ch_name
     *
     * @return the value of doctor.doctor_ch_name
     *
     * @mbg.generated
     */
    public String getDoctorChName() {
        return doctorChName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_ch_name
     *
     * @param doctorChName the value for doctor.doctor_ch_name
     *
     * @mbg.generated
     */
    public void setDoctorChName(String doctorChName) {
        this.doctorChName = doctorChName == null ? null : doctorChName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_en_name
     *
     * @return the value of doctor.doctor_en_name
     *
     * @mbg.generated
     */
    public String getDoctorEnName() {
        return doctorEnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_en_name
     *
     * @param doctorEnName the value for doctor.doctor_en_name
     *
     * @mbg.generated
     */
    public void setDoctorEnName(String doctorEnName) {
        this.doctorEnName = doctorEnName == null ? null : doctorEnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_ch_position
     *
     * @return the value of doctor.doctor_ch_position
     *
     * @mbg.generated
     */
    public String getDoctorChPosition() {
        return doctorChPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_ch_position
     *
     * @param doctorChPosition the value for doctor.doctor_ch_position
     *
     * @mbg.generated
     */
    public void setDoctorChPosition(String doctorChPosition) {
        this.doctorChPosition = doctorChPosition == null ? null : doctorChPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_en_position
     *
     * @return the value of doctor.doctor_en_position
     *
     * @mbg.generated
     */
    public String getDoctorEnPosition() {
        return doctorEnPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_en_position
     *
     * @param doctorEnPosition the value for doctor.doctor_en_position
     *
     * @mbg.generated
     */
    public void setDoctorEnPosition(String doctorEnPosition) {
        this.doctorEnPosition = doctorEnPosition == null ? null : doctorEnPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_introduction
     *
     * @return the value of doctor.doctor_introduction
     *
     * @mbg.generated
     */
    public String getDoctorIntroduction() {
        return doctorIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_introduction
     *
     * @param doctorIntroduction the value for doctor.doctor_introduction
     *
     * @mbg.generated
     */
    public void setDoctorIntroduction(String doctorIntroduction) {
        this.doctorIntroduction = doctorIntroduction == null ? null : doctorIntroduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_img
     *
     * @return the value of doctor.doctor_img
     *
     * @mbg.generated
     */
    public String getDoctorImg() {
        return doctorImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_img
     *
     * @param doctorImg the value for doctor.doctor_img
     *
     * @mbg.generated
     */
    public void setDoctorImg(String doctorImg) {
        this.doctorImg = doctorImg == null ? null : doctorImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_sex
     *
     * @return the value of doctor.doctor_sex
     *
     * @mbg.generated
     */
    public Integer getDoctorSex() {
        return doctorSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_sex
     *
     * @param doctorSex the value for doctor.doctor_sex
     *
     * @mbg.generated
     */
    public void setDoctorSex(Integer doctorSex) {
        this.doctorSex = doctorSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_mobile
     *
     * @return the value of doctor.doctor_mobile
     *
     * @mbg.generated
     */
    public String getDoctorMobile() {
        return doctorMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_mobile
     *
     * @param doctorMobile the value for doctor.doctor_mobile
     *
     * @mbg.generated
     */
    public void setDoctorMobile(String doctorMobile) {
        this.doctorMobile = doctorMobile == null ? null : doctorMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_email
     *
     * @return the value of doctor.doctor_email
     *
     * @mbg.generated
     */
    public String getDoctorEmail() {
        return doctorEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_email
     *
     * @param doctorEmail the value for doctor.doctor_email
     *
     * @mbg.generated
     */
    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail == null ? null : doctorEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.ctime
     *
     * @return the value of doctor.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.ctime
     *
     * @param ctime the value for doctor.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.status
     *
     * @return the value of doctor.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.status
     *
     * @param status the value for doctor.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorId=").append(doctorId);
        sb.append(", classId=").append(classId);
        sb.append(", doctorChName=").append(doctorChName);
        sb.append(", doctorEnName=").append(doctorEnName);
        sb.append(", doctorChPosition=").append(doctorChPosition);
        sb.append(", doctorEnPosition=").append(doctorEnPosition);
        sb.append(", doctorIntroduction=").append(doctorIntroduction);
        sb.append(", doctorImg=").append(doctorImg);
        sb.append(", doctorSex=").append(doctorSex);
        sb.append(", doctorMobile=").append(doctorMobile);
        sb.append(", doctorEmail=").append(doctorEmail);
        sb.append(", ctime=").append(ctime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}