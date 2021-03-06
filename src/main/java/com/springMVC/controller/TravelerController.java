package com.springMVC.controller;

import com.springMVC.dao.CityDao;
import com.springMVC.dao.TravelerDao;
import com.springMVC.dao.TripDao;
import com.springMVC.dao.UserDaoImpl;
import com.springMVC.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

@Controller
public class TravelerController {
    @RequestMapping(value = "/addTraveler", method = RequestMethod.POST)
    public ModelAndView addUser(HttpSession session, @ModelAttribute("traveler") Traveler traveler, SessionStatus status) {
        TravelerDao travelerDao;
        ModelAndView mav = null;

        try {
            travelerDao = new TravelerDao();
            travelerDao.create(traveler);
            travelerDao.close();
            status.setComplete();
            session.setAttribute("traveler",traveler);
            TripController tc = new TripController();
            mav = new ModelAndView("info");
            mav.addObject("trip", new Trip());
        }catch(Exception e){
            mav = new ModelAndView("traveler", "message","Username already exists!");
            System.out.println("controller error " +e.getMessage());
        }
        return mav;
    }
}
