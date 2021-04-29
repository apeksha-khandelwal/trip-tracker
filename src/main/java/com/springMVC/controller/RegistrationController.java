package com.springMVC.controller;

import com.springMVC.dao.CityDao;
import com.springMVC.dao.UserDaoImpl;
import com.springMVC.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class RegistrationController {


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public ModelAndView addUser(HttpSession session, @ModelAttribute("user") User user, SessionStatus status) {
        UserDaoImpl userDao;
        ModelAndView mav = null;
        CityDao city = null;

        try {
            userDao = new UserDaoImpl();
            user.setRole("user");
            userDao.create(user);
            userDao.close();
            status.setComplete();
            city = new CityDao();
            mav = new ModelAndView("welcome");
            session.setAttribute("user", user);
            mav.addObject("Name", user.getFirstname());
            mav.addObject("list", city.list());
            return mav;

        }catch(Exception e){
            mav = new ModelAndView("register", "message","Username already exists!");
            System.out.println("controller error " +e.getMessage());
        }
        return mav;
    }

}
