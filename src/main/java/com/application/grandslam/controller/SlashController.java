////package perscholas.controller;
//
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//import com.application.grandslam.database.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//
//
//@Controller
//public class SlashController {
//	@Autowired
//	UserDao userDao;
//
//	@RequestMapping(value = { "/", "/index", "/index.html" })
//	public ModelAndView slash() {
//		ModelAndView response = new ModelAndView();
//	response.setViewName("index");
//	return response;
//	}
//
//	@GetMapping(value = "/search")
//	public ModelAndView getSearch() {
//		ModelAndView getSearch = new ModelAndView("search");
//		return getSearch;
//	}
//
//	@PostMapping(value = "/search")
//	public ModelAndView postSearch(@RequestParam("email") String email,HttpServletRequest request,HttpServletResponse response)
//			throws IOException {
//		ModelAndView res = new ModelAndView();
//		User user = userDao.findByEmail(email);
//		res.addObject("user", user);
//		res.addObject("search", null);
//		return res;
//	}
//	}