package com.willu.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tb_userInfo {
    private Integer id;

    private String campusname;

    private String studentcode;

    private String studentname;

    private String sex;

    private String faculty;

    private String profession;

    private Date adminsiontime;

    private Integer xuezhi;

    private String education;

    private String identity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCampusname() {
        return campusname;
    }

    public void setCampusname(String campusname) {
        this.campusname = campusname == null ? null : campusname.trim();
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode == null ? null : studentcode.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty == null ? null : faculty.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public Date getAdminsiontime() {
        return adminsiontime;
    }

    public void setAdminsiontime(Date adminsiontime) {
        this.adminsiontime = adminsiontime;
    }

    public Integer getXuezhi() {
        return xuezhi;
    }

    public void setXuezhi(Integer xuezhi) {
        this.xuezhi = xuezhi;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }
}