package com.example.systemspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 马欢欢
 * @date 2018/3/6
 */
@Controller
@RequestMapping
public class PageController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
