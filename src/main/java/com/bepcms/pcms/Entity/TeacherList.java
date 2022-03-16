package com.bepcms.pcms.Entity;

import com.alibaba.excel.annotation.ExcelProperty;

public class TeacherList {
    @ExcelProperty(value = "ID", index = 0)
    private String teacherid;

    @ExcelProperty(value = "用户名", index = 1)
    private String teachername;

    @ExcelProperty(value = "性别", index = 2)
    private String teachersex;

    @ExcelProperty(value = "年龄", index = 3)
    private Integer teacherage;

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeachersex() {
        return teachersex;
    }

    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex == null ? null : teachersex.trim();
    }

    public Integer getTeacherage() {
        return teacherage;
    }

    public void setTeacherage(Integer teacherage) {
        this.teacherage = teacherage;
    }
}