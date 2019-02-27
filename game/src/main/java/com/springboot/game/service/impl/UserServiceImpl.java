package com.springboot.game.service.impl;

import com.springboot.game.dao.UserDao;
import com.springboot.game.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.game.pojo.user;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao=null;

    @Override
    public void insertUser(String uid,String uname,String city,String country,int cardid,String avaurl){
        userDao.insertUser(uid,uname,city,country,cardid,avaurl);
    }
    @Override
    public user getUser(String uid){
        return userDao.getUser(uid);
    }
}
