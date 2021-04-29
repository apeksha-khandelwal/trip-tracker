package com.springMVC.controller;

import com.springMVC.dao.HotelDao;
import com.springMVC.pojo.Hotel;
import com.springMVC.pojo.Traveler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class HotelController {

    @RequestMapping(value = "/addHotel", method = RequestMethod.POST)
    public ModelAndView addHotel(HttpSession session, @ModelAttribute("hotel") Hotel hotel, SessionStatus status) {
        HotelDao hotelDao;
        ModelAndView mav = null;
        try{
            hotelDao = new HotelDao();
            hotelDao.create(hotel);
            hotelDao.close();
            status.setComplete();
            System.out.println("hotel "+hotel.getName());
            session.setAttribute("hotel", hotel);
            mav = new ModelAndView("traveler");
            mav.addObject("traveler", new Traveler());
        }catch(Exception e){
            System.out.println(e);
        }
        return mav;
    }
}
