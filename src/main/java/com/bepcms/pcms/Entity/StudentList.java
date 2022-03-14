package com.bepcms.pcms.Entity;

import com.alibaba.excel.annotation.ExcelProperty;

public class StudentList extends UserList {

    @ExcelProperty(value = "ID", index = 0)
    private String studentid;

    @ExcelProperty(value = "用户名", index = 1)
    private String studentname;

    @ExcelProperty(value = "性别", index = 2)
    private String studentsex;

    @ExcelProperty(value = "年龄", index = 3)
    private Integer studentage;

    @ExcelProperty(value = "学院", index = 4)
    private String college;

    @ExcelProperty(value = "专业", index = 5)
    private String major;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex == null ? null : studentsex.trim();
    }

    public Integer getStudentage() {
        return studentage;
    }

    public void setStudentage(Integer studentage) {
        this.studentage = studentage;
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