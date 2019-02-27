package com.springboot.game.service;
import com.springboot.game.pojo.user;

public interface UserService {
    void insertUser(String uid,String uname,String city,String country,int cardid,String avaurl);
    user getUser(String uid);
}
