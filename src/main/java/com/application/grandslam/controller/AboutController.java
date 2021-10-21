package com.application.grandslam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class AboutController {
	@GetMapping("/")
	public String getAboutMePage() {
		return "Home Page";
	}
}
