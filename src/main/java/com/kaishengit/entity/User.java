package com.kaishengit.entity;

import java.util.StringTokenizer;

/**
 * Created by Administrator on 2016/4/8.
 */
public class User {
    public static final String USER_STATE_NORMAL = "正常";
    public static final String USER_STATE_DISABLE = "禁用";//这里干嘛的，后面哪里用到了。
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private String createtime;
    private String logintime;
    private String loginip;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }


}
