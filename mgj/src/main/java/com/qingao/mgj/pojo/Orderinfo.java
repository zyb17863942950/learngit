package com.qingao.mgj.pojo;

import java.util.Date;

public class Orderinfo {
    private String ofid;

    private Integer userid;

    private Date ofdate;

    private Integer ofstate;

    private String address;

    private String recipient;

    private String contactnumber;

    public String getOfid() {
        return ofid;
    }

    public void setOfid(String ofid) {
        this.ofid = ofid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOfdate() {
        return ofdate;
    }

    public void setOfdate(Date ofdate) {
        this.ofdate = ofdate;
    }

    public Integer getOfstate() {
        return ofstate;
    }

    public void setOfstate(Integer ofstate) {
        this.ofstate = ofstate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
}