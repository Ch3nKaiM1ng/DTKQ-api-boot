package com.dtkq.api.entity;

import java.io.Serializable;
import java.util.Date;

public class AuthMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_menu.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_menu.auth_id
     *
     * @mbg.generated
     */
    private Integer authId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_menu.menu_id
     *
     * @mbg.generated
     */
    private Integer menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_menu.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auth_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_menu.id
     *
     * @return the value of auth_menu.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_menu.id
     *
     * @param id the value for auth_menu.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_menu.auth_id
     *
     * @return the value of auth_menu.auth_id
     *
     * @mbg.generated
     */
    public Integer getAuthId() {
        return authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_menu.auth_id
     *
     * @param authId the value for auth_menu.auth_id
     *
     * @mbg.generated
     */
    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_menu.menu_id
     *
     * @return the value of auth_menu.menu_id
     *
     * @mbg.generated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_menu.menu_id
     *
     * @param menuId the value for auth_menu.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_menu.ctime
     *
     * @return the value of auth_menu.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_menu.ctime
     *
     * @param ctime the value for auth_menu.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_menu
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
        sb.append(", authId=").append(authId);
        sb.append(", menuId=").append(menuId);
        sb.append(", ctime=").append(ctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}