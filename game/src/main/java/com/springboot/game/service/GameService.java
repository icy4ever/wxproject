package com.springboot.game.service;

import com.springboot.game.pojo.game;
import java.util.List;
public interface GameService {
    game getGame(String name);
    List<game> gethotGame(int hotlevel);
}
