package com.application.grandslam.controller;

import java.io.IOException;
import java.lang.annotation.Native;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;


import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.repositories.UserRepository;
import com.application.grandslam.database.services.UserService;
import com.application.grandslam.security.UserDetailsServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import
//        org.springframework.data.domain.Example;
//import
//        org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import com.application.grandslam.forms.LoginForm;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static java.util.Optional.ofNullable;

@Controller
public class LoginController {
    static Logger LOG = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/login")
    public ModelAndView getLoginPage() {
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    @PostMapping(value = "/login")
    public String checkLoginPage(@ModelAttribute("LoginForm") LoginForm form, @RequestParam("email") String email, HttpServletResponse response, HttpSession session) throws IOException {
        ModelAndView view = new ModelAndView("login");
        User user = userRepository.findByEmail(form.getEmail());
        LOG.info(String.valueOf(user));
        if(user ==  null)  {
            LOG.error("User could not be found in the system");
            response.sendRedirect("/login");
            view.addObject("error","Username or password is incorrect");
            return "login";
        }
        LOG.info("User was found");

        return "redirect:/players";
    }

    @GetMapping(value = "/logout")
    public ModelAndView
    logOut(@ModelAttribute("login") LoginForm login) {
        ModelAndView logOutView = new ModelAndView("login");
        logOutView.setViewName("redirect:/index");
        return logOutView;
    }

}
