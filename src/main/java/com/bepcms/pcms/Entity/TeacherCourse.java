package com.bepcms.pcms.Entity;

public class TeacherCourse {
    private Integer tcid;

    private String teacherid;

    private String courseid;

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }
}