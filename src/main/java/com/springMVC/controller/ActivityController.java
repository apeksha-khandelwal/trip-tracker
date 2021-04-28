package com.springMVC.controller;

import com.springMVC.dao.ActivityDao;
import com.springMVC.pojo.Activity;
import com.springMVC.pojo.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class ActivityController {
//    @RequestMapping(value = "/listAdventures", method = RequestMethod.GET)
    public ModelAndView listAdvent(HttpSession session, @ModelAttribute("city") City city) {
        ModelAndView mav = new ModelAndView("welcome");

//        session.setAttribute("city", city.getId());
        return mav;
    }
}
