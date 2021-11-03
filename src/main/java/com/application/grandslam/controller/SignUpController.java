package com.application.grandslam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.entities.UserRole;
import com.application.grandslam.database.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.application.grandslam.forms.SignUpForm;



@RestController
public class SignUpController {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserService userService;

	/*
	 * @Autowired PasswordEncoder passwordEncoder;
	 */

	@GetMapping(value = "signup")
	public ModelAndView GetLoginUser() {
		ModelAndView signupPage = new ModelAndView("signup");
		signupPage.addObject("form", new SignUpForm());
		return signupPage;

	}

	@PostMapping(value = "signup")
	public ModelAndView PostLoginUser(HttpServletResponse response, @Valid @ModelAttribute("SignUpForm") SignUpForm form, BindingResult bindingResult) {
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

		else {
			List<User> users = new ArrayList<User>();
			List<UserRole> userRoles = new ArrayList<UserRole>();
			User user = new User();
			UserRole userRole = new UserRole();
			user.setFirstName(form.getFirstName());
			user.setLastName(form.getLastName());
			user.setEmail(form.getEmail());
			userRole.setRole("USER");
			user.setPassword(passwordEncoder.encode(form.getPassword()));

			userService.save(user);
			System.out.println("User has been saved...");
			return new ModelAndView("showPlayers");
			
		}

	}


}

// need to get fullname,email and password from the form in the login jsp
// I need to create a session and get the attributes of name email and password
// from the getters of the Users bean
//		request.getAttribute("name");
//		request.getAttribute("password");

//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response) {
//		ModelAndView result = new ModelAndView("login");
//		return result;
//	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public ModelAndView getPostLogin(@RequestParam String name, @RequestParam String email,@RequestParam String password, HttpServletRequest request, HttpServletResponse response,
//			HttpSession session) {
//		ModelAndView result = new ModelAndView();
//		Users user = new Users();
//		if(name != null) {
//			result.addObject("name");
//			result.addObject("password");
//			result.addObject("email");
//		}
//
//		if(!"tom".equals(session.getAttribute("name")) || !"john".equals(session.getAttribute("password")) || !"ryan@gmail.com".equals("email")){
//			result.addObject("message","Please enter your information");
//			return result;
//		}
//		else {
//			result.setViewName("redirect:/success");
//			result.addObject("name", session.getAttribute("name"));
//			result.addObject("password", session.getAttribute("password"));
//
//		}
//		return result;
//	}
