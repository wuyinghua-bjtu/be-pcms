package com.bepcms.pcms.Entity;

public class CourseLab {
    private Integer labid;

    private Integer infoid;

    private String labname;

    private String labstyle;

    private String labenv;

    private String hasgroup;

    private Integer groupmatenum;

    private String labtype;

    private String aim;

    private String principle;

    private String guide;

    private String notice;

    private Boolean hasfile;

    private String filetag;

    private String duration;

    public Integer getLabid() {
        return labid;
    }

    public void setLabid(Integer labid) {
        this.labid = labid;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getLabname() {
        return labname;
    }

    public void setLabname(String labname) {
        this.labname = labname == null ? null : labname.trim();
    }

    public String getLabstyle() {
        return labstyle;
    }

    public void setLabstyle(String labstyle) {
        this.labstyle = labstyle == null ? null : labstyle.trim();
    }

    public String getLabenv() {
        return labenv;
    }

    public void setLabenv(String labenv) {
        this.labenv = labenv == null ? null : labenv.trim();
    }

    public String getHasgroup() {
        return hasgroup;
    }

    public void setHasgroup(String hasgroup) {
        this.hasgroup = hasgroup == null ? null : hasgroup.trim();
    }

    public Integer getGroupmatenum() {
        return groupmatenum;
    }

    public void setGroupmatenum(Integer groupmatenum) {
        this.groupmatenum = groupmatenum;
    }

    public String getLabtype() {
        return labtype;
    }

    public void setLabtype(String labtype) {
        this.labtype = labtype == null ? null : labtype.trim();
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim == null ? null : aim.trim();
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle == null ? null : principle.trim();
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide == null ? null : guide.trim();
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    public Boolean getHasfile() {
        return hasfile;
    }

    public void setHasfile(Boolean hasfile) {
        this.hasfile = hasfile;
    }

    public String getFiletag() {
        return filetag;
    }

    public void setFiletag(String filetag) {
        this.filetag = filetag == null ? null : filetag.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }
}