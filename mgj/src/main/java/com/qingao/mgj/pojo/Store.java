package com.qingao.mgj.pojo;

public class Store {
    private Integer stid;

    private String stlogname;

    private String stpassword;

    private String salt;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStlogname() {
        return stlogname;
    }

    public void setStlogname(String stlogname) {
        this.stlogname = stlogname;
    }

    public String getStpassword() {
        return stpassword;
    }

    public void setStpassword(String i) {
        this.stpassword = i;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}