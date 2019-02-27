package com.springboot.game.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.springboot.game.pojo.game;

import java.util.List;

@Repository
public interface GameDao {
    game getGame(@Param("name") String name);
    List<game> gethotGame(@Param("hotlevel")int hotlevel);
}
