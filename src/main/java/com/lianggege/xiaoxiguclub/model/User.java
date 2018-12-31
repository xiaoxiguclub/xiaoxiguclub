package com.lianggege.xiaoxiguclub.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.ID
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.NICKNAME
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.LOGIN_ACT
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String loginAct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.LOGIN_PWD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String loginPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.CREATE_TIME
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.LOCK_STATUS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String lockStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.EMAIL
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.PHONE
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.AVATAR
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USERS.ROLE
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    private String role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.ID
     *
     * @return the value of USERS.ID
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.ID
     *
     * @param id the value for USERS.ID
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.NICKNAME
     *
     * @return the value of USERS.NICKNAME
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.NICKNAME
     *
     * @param nickname the value for USERS.NICKNAME
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.LOGIN_ACT
     *
     * @return the value of USERS.LOGIN_ACT
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getLoginAct() {
        return loginAct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.LOGIN_ACT
     *
     * @param loginAct the value for USERS.LOGIN_ACT
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct == null ? null : loginAct.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.LOGIN_PWD
     *
     * @return the value of USERS.LOGIN_PWD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.LOGIN_PWD
     *
     * @param loginPwd the value for USERS.LOGIN_PWD
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.CREATE_TIME
     *
     * @return the value of USERS.CREATE_TIME
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.CREATE_TIME
     *
     * @param createTime the value for USERS.CREATE_TIME
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.LOCK_STATUS
     *
     * @return the value of USERS.LOCK_STATUS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getLockStatus() {
        return lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.LOCK_STATUS
     *
     * @param lockStatus the value for USERS.LOCK_STATUS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus == null ? null : lockStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.EMAIL
     *
     * @return the value of USERS.EMAIL
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.EMAIL
     *
     * @param email the value for USERS.EMAIL
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.PHONE
     *
     * @return the value of USERS.PHONE
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.PHONE
     *
     * @param phone the value for USERS.PHONE
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.AVATAR
     *
     * @return the value of USERS.AVATAR
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.AVATAR
     *
     * @param avatar the value for USERS.AVATAR
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USERS.ROLE
     *
     * @return the value of USERS.ROLE
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USERS.ROLE
     *
     * @param role the value for USERS.ROLE
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}