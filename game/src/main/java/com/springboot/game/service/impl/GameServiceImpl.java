package com.springboot.game.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.game.service.GameService;
import com.springboot.game.dao.GameDao;
import com.springboot.game.pojo.game;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameDao gameDao=null;

    @Override
    public game getGame(String name){
        return gameDao.getGame(name);
    }

    @Override
    public List<game> gethotGame(int hotlevel){
        return gameDao.gethotGame(hotlevel);
    }
}
