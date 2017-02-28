package com.seu.fff.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String username;

    private String password;

    private String img;

    private String sex;

    private Integer iphone;

    public Integer getIphone() {
        return iphone;
    }

    public void setIphone(Integer iphone) {
        this.iphone = iphone;
    }

    private Date date;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {

    }
}