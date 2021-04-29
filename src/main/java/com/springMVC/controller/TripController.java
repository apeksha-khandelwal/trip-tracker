package com.springMVC.controller;

import com.springMVC.dao.TripDao;
import com.springMVC.pojo.Activity;
import com.springMVC.pojo.City;
import com.springMVC.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class TripController {
//
//    @RequestMapping(value = "/addTrip", method = RequestMethod.GET)
//    public ModelAndView addTrip(HttpSession session, @ModelAttribute("trip") Activity activities) {
//        TripDao tripDao;
//        ModelAndView mav = null;
//        Trip trip=new Trip();
//        try {
//            tripDao = new TripDao();
//            trip.setUser((User)session.getAttribute("user"));
//            trip.setCity((City)session.getAttribute("city"));
//            tripDao.create(trip);
//            tripDao.close();
//            mav = new ModelAndView("hotel");
//            session.setAttribute("trip", trip);
//            return mav;
//
//        }catch(Exception e){
//            mav = new ModelAndView("register", "message","Username already exists!");
//            System.out.println("controller error " +e.getMessage());
//        }
//        return mav;
//    }

}
