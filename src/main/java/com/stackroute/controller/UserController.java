package com.stackroute.controller;

import com.stackroute.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.security.auth.login.Configuration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @PostMapping(value="/display")
    public ModelAndView display(HttpServletRequest request, HttpServletResponse response){


        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("user",request.getParameter("username"));

        return modelAndView;
    }



}
