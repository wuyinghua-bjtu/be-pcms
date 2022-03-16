package com.bepcms.pcms.Entity;

import com.alibaba.excel.annotation.ExcelProperty;

public class AdminList extends UserList{

    @ExcelProperty(value = "ID", index = 0)
    private String adminid;

    @ExcelProperty(value = "用户名", index = 1)
    private String adminname;

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }
}