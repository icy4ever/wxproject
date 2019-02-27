package com.springboot.game.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.springboot.game.pojo.user;

@Repository
public interface UserDao {
    void insertUser(@Param("uid")String uid,@Param("uname")String uname,@Param("city")String city,@Param("country")String country,@Param("cardid")int cardid,@Param("avaurl") String avaurl);
    user getUser(@Param("uid")String uid);
}
