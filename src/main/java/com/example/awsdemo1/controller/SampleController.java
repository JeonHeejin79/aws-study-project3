package com.example.awsdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping(value = "/hello")
    public ModelAndView hello() {

        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "hello World");
        mav.setViewName("hello");

        return mav;
    }

}
