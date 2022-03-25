package com.bepcms.pcms.Entity;

import java.util.Date;

public class AccountInfo {
    private Integer userid;

    private String username;

    private String usertypecode;

    private Date logintime;

    private Integer totaltime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsertypecode() {
        return usertypecode;
    }

    public void setUsertypecode(String usertypecode) {
        this.usertypecode = usertypecode == null ? null : usertypecode.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Integer getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Integer totaltime) {
        this.totaltime = totaltime;
    }
}