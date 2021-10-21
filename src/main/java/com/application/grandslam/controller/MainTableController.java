package com.application.grandslam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class MainTableController {
	@RequestMapping(value="/games",method=RequestMethod.GET)
	public ModelAndView getGames() {
		ModelAndView page = new ModelAndView("playersTable");
		return page;
	}
}
