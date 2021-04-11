package com.gaf.coursemanageapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/hello")
    public  String sayHello(Model model){
        System.out.println("Saying Hello World");
        model.addAttribute("message","Greetings from TangYuCheng");
        return "hello";
    }
}
