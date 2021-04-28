package com.springMVC.controller;

import com.springMVC.dao.ActivityDao;
import com.springMVC.dao.CityDao;
import com.springMVC.pojo.City;
import com.springMVC.pojo.User;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class CityController {

    @RequestMapping(value = "/listActivities", method = RequestMethod.GET)
    public ModelAndView listActivity(HttpSession session, @ModelAttribute("city") City city) {
        ActivityDao act = new ActivityDao();
        ModelAndView mav = null;
        try{
            mav = new ModelAndView("welcome");
            mav.addObject("activities", act.list(city.getCityId()));
            System.out.println(act.list(city.getCityId()).size()+"length");
            session.setAttribute("city", city.getCityId());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return mav;
    }
}