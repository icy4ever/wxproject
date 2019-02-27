package com.springboot.game.controller;

import com.springboot.game.service.HttpClient;
import com.springboot.game.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/deUserId")
public class UserIdController {

    @Autowired
    private HttpClient httpClient;

    @RequestMapping("/getId")
    @ResponseBody
    public String getId(String appid,String secret,String js_code){
        String url="https://api.weixin.qq.com/sns/jscode2session?appid="+ appid + "&secret=" + secret + "&js_code="+ js_code + "&grant_type=authorization_code";
        HttpMethod method=HttpMethod.GET;
        MultiValueMap<String,String> params=new LinkedMultiValueMap<>();
        return httpClient.client(url,method,params);
    }
}
