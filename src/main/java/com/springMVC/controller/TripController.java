package com.springMVC.controller;

import com.springMVC.dao.TripActivityDao;
import com.springMVC.dao.TripDao;
import com.springMVC.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class TripController {

    @RequestMapping(value = "/addTrip", method = RequestMethod.POST)
    public ModelAndView addTrip(HttpSession session, @ModelAttribute("trip")Trip trip) {
        TripDao tripDao;
        ModelAndView mav = null;
        TripActivityDao taDao = new TripActivityDao();
        try {
            tripDao = new TripDao();
            trip.setUser((User)session.getAttribute("user"));
            trip.setCity((City)session.getAttribute("city"));
            trip.setHotel((Hotel) session.getAttribute("hotel"));
            trip.setTraveler((Traveler) session.getAttribute("traveler"));
            System.out.println(trip.getUser().getFirstname());
            System.out.println(trip.getCity().getName());
            int id = tripDao.create(trip);
            trip.setTripId(id);
            tripDao.close();
            List<Activity> act = (List<Activity>) session.getAttribute("activities");
            for(Activity a : act){
                taDao.createTripActivity(new TripActivity(trip, a));
            }
            taDao.close();
            session.removeAttribute("city");
            session.removeAttribute("hotel");
            session.removeAttribute("traveler");
            session.removeAttribute("activities");
            mav =  new ModelAndView("currentTrips");
        }catch(Exception e){
            System.out.println("controller error " +e);
        }
        return mav;
    }

    @RequestMapping(value = "/listTrip", method = RequestMethod.POST)
    public ModelAndView listTrip(HttpSession session) {
        TripDao tripDao;
        ModelAndView mav = null;
        try {
            tripDao = new TripDao();
            session.setAttribute("trip", tripDao.list());
            tripDao.close();
            mav = new ModelAndView("currentTrips");
            return mav;

        }catch(Exception e){
            mav = new ModelAndView("register", "message","No trips");
            System.out.println("controller error " +e.getMessage());
        }
        return mav;
    }

}
