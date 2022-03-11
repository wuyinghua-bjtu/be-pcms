package com.bepcms.pcms.Entity;

public class CourseInfo {
    private Integer infoid;

    private String courseid;

    private String coursename;

    private Integer period;

    private Integer credits;

    private Integer labperiod;

    private String college;

    private String teacherid;

    private String teachername;

    private String labtype;

    private String grade;

    private String major;

    private String isnecessary;

    private Integer labtimes;

    private Integer labnum;

    private Integer term;

    private Integer studentnum;

    private Integer groupmatenum;

    private String laboratoryname;

    private Integer experimenternum;

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