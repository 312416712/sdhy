package com.sdhy.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserDriver implements Serializable {
    //id主键
    private Integer id;
    //密码
    private String password;
    //性别
    private Integer sex;
    //手机号
    private String mobile;
    //用户头像
    private String logo;
    //登录状态
    private Integer status;
    //注册时间
    private Date registerTime;
    //登录时间
    private Date lastLogTime;

    public UserDriver() {
    }

    public UserDriver(Integer id, String password, Integer sex, String mobile, String logo, Integer status, Date registerTime, Date lastLogTime) {
        this.id = id;
        this.password = password;
        this.sex = sex;
        this.mobile = mobile;
        this.logo = logo;
        this.status = status;
        this.registerTime = registerTime;
        this.lastLogTime = lastLogTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLogTime() {
        return lastLogTime;
    }

    public void setLastLogTime(Date lastLogTime) {
        this.lastLogTime = lastLogTime;
    }
}
