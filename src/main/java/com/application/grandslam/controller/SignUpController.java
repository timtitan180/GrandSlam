package com.application.grandslam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.application.grandslam.database.entities.Role;
import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.application.grandslam.forms.SignUpForm;



@Controller
public class SignUpController {
	public static final Logger LOG = LoggerFactory.getLogger(SignUpController.class);

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserService userService;

	@GetMapping(value = "signup")
	public ModelAndView GetLoginUser() {
		ModelAndView signupPage = new ModelAndView("signup");
		signupPage.addObject("form", new SignUpForm());
		return signupPage;

	}

	@PostMapping(value = "players")
	public ModelAndView PostLoginUser(HttpSession session, HttpServletResponse response, @Valid @ModelAttribute("SignUpForm") SignUpForm form, BindingResult bindingResult) {
		ModelAndView postSignupPage = new ModelAndView("signup");
		postSignupPage.addObject("form", form);
		List<String> errors = new ArrayList<String>();

		for (FieldError error : bindingResult.getFieldErrors()) {
			System.out.println("Error:" + "=" + error.getField());
			errors.add(error.getDefaultMessage());
			System.out.println(errors);
		}

		postSignupPage.addObject("errors", errors);

		if (errors.size() > 0) {
			return postSignupPage;
		}
			User user = new User();
			Role role = new Role();
			postSignupPage.addObject("role",role);
			user.setFirstName(form.getFirstName());
			user.setLastName(form.getLastName());
			user.setEmail(form.getEmail());
			role.setRole(form.getRole());
			user.setRole(role);
			user.setPassword(passwordEncoder.encode(form.getPassword()));

			userService.save(user);
			session.setAttribute("user",user.getRole());
			LOG.info(user.toString());
			LOG.info(role.toString());
			System.out.println(role.getRole().toString());
			

		return new ModelAndView("showPlayers");
	}


}

