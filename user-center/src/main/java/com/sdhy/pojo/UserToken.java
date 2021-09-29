package com.sdhy.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

public class UserToken {
    //主键
    private Integer id;
    //手机号
    private String mobile;
    //用户类型
    private Integer userType;
    //钱
    private String token;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastModifyTime;
    //有效时长
    private double validDuration;
    //是否失效
    private Integer isValid;

    public UserToken() {
    }

    public UserToken(Integer id, String mobile, Integer userType, String token, Date createTime, Date lastModifyTime, double validDuration, Integer isValid) {
        this.id = id;
        this.mobile = mobile;
        this.userType = userType;
        this.token = token;
        this.createTime = createTime;
        this.lastModifyTime = lastModifyTime;
        this.validDuration = validDuration;
        this.isValid = isValid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public double getValidDuration() {
        return validDuration;
    }

    public void setValidDuration(double validDuration) {
        this.validDuration = validDuration;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
