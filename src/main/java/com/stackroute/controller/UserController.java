package com.stackroute.controller;

import com.stackroute.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.security.auth.login.Configuration;

@Controller
public class UserController {

    @RequestMapping(value="/",method= RequestMethod.GET)
    public ModelAndView createObject(){

        ApplicationContext context= new AnnotationConfigApplicationContext("com.stackroute");
        User user=context.getBean("user",User.class);
        ModelAndView modelAndView=new ModelAndView("iindex");
        modelAndView.addObject("user",user.getName());

        return modelAndView;
    }



}
