package com.springboot.game.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias(value="user")
public class user implements Serializable {
    private static final long serizalVersionUID=7760614561073458247L;
    private String uid;
    private String uname;
    private String city;
    private String country;
    private int cardid;
    private String avaurl;

    public String getAvaurl() {
        return avaurl;
    }

    public void setAvaurl(String avaurl) {
        this.avaurl = avaurl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCardid() {
        return cardid;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
    }
}
