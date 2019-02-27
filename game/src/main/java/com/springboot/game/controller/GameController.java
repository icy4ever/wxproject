package com.springboot.game.controller;

import com.springboot.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springboot.game.pojo.game;
import java.util.List;

@Controller
@RequestMapping("/game")
public class GameController {
    @Autowired
    private GameService gameService=null;

    @RequestMapping("/getGame")
    @ResponseBody
    public game getGame(String name){
        return gameService.getGame(name);
    }

    @RequestMapping("/gethotgame")
    @ResponseBody
    public List<game> gethotGame(int hotlevel){
        return gameService.gethotGame(hotlevel);
    }
}
