package com.qingao.mgj.pojo;

import java.util.Date;

public class Goodsinfo {
    private Integer gdid;

    private String gdname;

    private Integer stid;

    private String gtkeywords;

    private Date gtdate;

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getGtkeywords() {
        return gtkeywords;
    }

    public void setGtkeywords(String gtkeywords) {
        this.gtkeywords = gtkeywords;
    }

    public Date getGtdate() {
        return gtdate;
    }

    public void setGtdate(Date gtdate) {
        this.gtdate = gtdate;
    }
}