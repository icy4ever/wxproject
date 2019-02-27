package com.springboot.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springboot.game.service.UserService;
import com.springboot.game.pojo.user;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService=null;

    @RequestMapping("/insertUser")
    @ResponseBody
    public void insertUser(String uid,String uname,String city,String country,int cardid,String avaurl){
        userService.insertUser(uid,uname,city,country,cardid,avaurl);
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public user getUser(String uid){
        return userService.getUser(uid);
    }
}
