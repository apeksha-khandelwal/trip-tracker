package com.springMVC.controller;

import com.springMVC.dao.UserDaoImpl;
import com.springMVC.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    private UserDaoImpl userDao;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("login", new User());
        return mav;
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpSession session, @ModelAttribute("login") User login) throws Exception {
        ModelAndView mav = null;

        User user = userDao.get(login.getUsername());

        if (null != user) {
            mav = new ModelAndView("welcome");
            session.setAttribute("username", login.getUsername());
            mav.addObject("Name", user.getFirstname());
        } else {
            mav = new ModelAndView("login");
            mav.addObject("message", "Username or Password is wrong!!");
        }

        return mav;
    }
}
