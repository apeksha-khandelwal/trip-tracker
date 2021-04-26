package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class CityController {

    @RequestMapping(value = "/listAdventures", method = RequestMethod.GET)
    public ModelAndView listAdvent(HttpSession session) {
        ModelAndView mav = new ModelAndView("welcome");
        return mav;
    }
}
