package com.springMVC.controller;

import com.springMVC.dao.UserDao;
import com.springMVC.dao.UserDaoImpl;
import com.springMVC.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegistrationController {

    @Autowired
    private UserDaoImpl userDao;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("user", new User());

        return mav;
    }

    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user, SessionStatus status) {
        try {
            user.setRole("user");
            userDao.create(user);
            userDao.close();
            status.setComplete();
            return new ModelAndView("welcome", "Name", user.getFirstname());

        }catch(Exception e){
            System.out.println("controller error " +e.getMessage());
        }
        return null;
    }

}
