package com.willu.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tb_statyRecords {
    private Integer id;

    private String studentcode;

    private String buildingname;

    private Integer roomnum;

    private Integer bednum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode == null ? null : studentcode.trim();
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname == null ? null : buildingname.trim();
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }
}