package com.xiaozhang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class controller {

    @RequestMapping(value = "/testHello")
    public String testHello(){


        System.out.println("==============================================================");

        return "success";
    }

}
