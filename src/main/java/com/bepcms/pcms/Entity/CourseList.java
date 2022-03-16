package com.bepcms.pcms.Entity;

import com.alibaba.excel.annotation.ExcelProperty;

public class CourseList {

    @ExcelProperty(value = "ID", index = 0)
    private String courseid;

    @ExcelProperty(value = "课程名", index = 1)
    private String coursename;

    @ExcelProperty(value = "总学分", index = 2)
    private Integer credits;

    @ExcelProperty(value = "总学时", index = 3)
    private Integer period;

    @ExcelProperty(value = "开课学院", index = 4)
    private String college;

    @ExcelProperty(value = "面向专业", index = 5)
    private String major;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }
}