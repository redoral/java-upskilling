package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("hello")
    public String hello(){
        return "Hello.jsp";
    }
    @RequestMapping("hai")
    public String hai(){
        return "Hai.jsp";
    }
}
