package com.application.grandslam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getHomePage() {
        ModelAndView result = new ModelAndView("home");
        result.addObject("message","Team must have at least 11 players to show the leaderboard");
        return result;
    }

//    @RequestMapping(value="/home/",method = RequestMethod.POST)
//    public ModelAndView postHomePage() {
//        ModelAndView result = new ModelAndView("");
//        return result;
//    }
}