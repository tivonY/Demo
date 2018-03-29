package com.tivon.server.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/greeting")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/fragments");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }
    
    @RequestMapping(value = "/main")
    public ModelAndView main(ModelAndView mv) {
        mv.setViewName("/view/main");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }
    
    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("/view/login.html");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
