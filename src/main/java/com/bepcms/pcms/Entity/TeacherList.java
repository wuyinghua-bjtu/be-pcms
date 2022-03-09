package com.bepcms.pcms.Entity;

public class TeacherList {
    private String teacherid;

    private String teachername;

    private String teachersex;

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