package com.example.systemspringboot.controller;

import com.example.systemspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 马欢欢
 * @date 2018/3/5
 */
@RestController
@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("")
    public String index(){
        return "Hello World!";
    }
    @RequestMapping("query")
    public Map<String,Object> queryUserInfo(){
        Map<String,Object> map = new HashMap<>();
        try {
            map.put("info",userService.queryUserInfo());
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
