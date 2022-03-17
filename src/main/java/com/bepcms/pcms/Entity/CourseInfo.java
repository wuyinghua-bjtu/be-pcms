package com.bepcms.pcms.Entity;

import com.alibaba.excel.annotation.ExcelProperty;

public class CourseInfo {
    private Integer infoid;

    @ExcelProperty(value = "课程号", index = 0)
    private String courseid;

    @ExcelProperty(value = "课程名", index = 1)
    private String coursename;

    @ExcelProperty(value = "总学时", index = 2)
    private Integer period;

    @ExcelProperty(value = "总学分", index = 3)
    private Integer credits;

    @ExcelProperty(value = "实验学时", index = 4)
    private Integer labperiod;

    @ExcelProperty(value = "开课学院", index = 5)
    private String college;

    @ExcelProperty(value = "教师编号", index = 6)
    private String teacherid;

    @ExcelProperty(value = "教师姓名", index = 7)
    private String teachername;

    @ExcelProperty(value = "实验课类型", index = 8)
    private String labtype;

    @ExcelProperty(value = "面向年级", index = 9)
    private String grade;

    @ExcelProperty(value = "面向专业", index = 10)
    private String major;

    @ExcelProperty(value = "实验要求", index = 11)
    private String isnecessary;

    @ExcelProperty(value = "实验次数", index = 12)
    private Integer labtimes;

    @ExcelProperty(value = "实验项目数", index = 13)
    private Integer labnum;

    @ExcelProperty(value = "学期", index = 14)
    private Integer term;

    @ExcelProperty(value = "学生人数", index = 15)
    private Integer studentnum;

    @ExcelProperty(value = "小组人数", index = 16)
    private Integer groupmatenum;

    @ExcelProperty(value = "开课实验室名称", index = 17)
    private String laboratoryname;

    @ExcelProperty(value = "实验员人数", index = 18)
    private Integer experimenternum;

    @ExcelProperty(value = "实验地点", index = 19)
    private String address;

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

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

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getLabperiod() {
        return labperiod;
    }

    public void setLabperiod(Integer labperiod) {
        this.labperiod = labperiod;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

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

    public String getLabtype() {
        return labtype;
    }

    public void setLabtype(String labtype) {
        this.labtype = labtype == null ? null : labtype.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getIsnecessary() {
        return isnecessary;
    }

    public void setIsnecessary(String isnecessary) {
        this.isnecessary = isnecessary == null ? null : isnecessary.trim();
    }

    public Integer getLabtimes() {
        return labtimes;
    }

    public void setLabtimes(Integer labtimes) {
        this.labtimes = labtimes;
    }

    public Integer getLabnum() {
        return labnum;
    }

    public void setLabnum(Integer labnum) {
        this.labnum = labnum;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(Integer studentnum) {
        this.studentnum = studentnum;
    }

    public Integer getGroupmatenum() {
        return groupmatenum;
    }

    public void setGroupmatenum(Integer groupmatenum) {
        this.groupmatenum = groupmatenum;
    }

    public String getLaboratoryname() {
        return laboratoryname;
    }

    public void setLaboratoryname(String laboratoryname) {
        this.laboratoryname = laboratoryname == null ? null : laboratoryname.trim();
    }

    public Integer getExperimenternum() {
        return experimenternum;
    }

    public void setExperimenternum(Integer experimenternum) {
        this.experimenternum = experimenternum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}