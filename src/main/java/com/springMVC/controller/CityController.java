package com.springMVC.controller;

import com.springMVC.dao.ActivityDao;
import com.springMVC.pojo.Activity;
import com.springMVC.pojo.City;
import com.springMVC.pojo.Hotel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class CityController {

    @RequestMapping(value = "/listActivities", method = RequestMethod.GET)
    public ModelAndView listActivity(HttpSession session, @ModelAttribute("city") City city) {
        ActivityDao act = new ActivityDao();
        ModelAndView mav = null;
        try{
            mav = new ModelAndView("welcome");
            mav.addObject("activities", act.list(city.getCityId()));
//            mav.addObject("trip", new Trip());
            System.out.println(act.list(city.getCityId()).size()+"length");
            session.setAttribute("city", city);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return mav;
    }

    @RequestMapping(value = "/addTrip", method = RequestMethod.GET)
    public ModelAndView addTrip(HttpServletRequest request, HttpSession session) {
        String[] activity = request.getParameterValues("activityId");
        List list = Arrays.asList(activity);
        System.out.println(list.size());
        session.setAttribute("activities", list);
        ModelAndView mav = new ModelAndView("hotel");
        mav.addObject("hotel", new Hotel());
        return mav;
    }
}