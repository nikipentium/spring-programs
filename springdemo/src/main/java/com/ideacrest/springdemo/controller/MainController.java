package com.ideacrest.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@Controller
public class MainController {
    @RequestMapping(value = "/hello")
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello Reader!");
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "/form")
    public ModelAndView getForm(){

        return new ModelAndView("spring-form", "command", new FormCollector());
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String submitForm(FormCollector command, BindingResult result, HttpServletRequest request, HttpServletResponse response){
        String country = request.getParameter("countries");
        String[] countries = request.getParameterValues("countries");
        System.out.println(country);
        Arrays.asList(countries).forEach(s -> System.out.println(s));
        command.getCountries().forEach(c -> System.out.println(c));
        return "success";
    }
}
