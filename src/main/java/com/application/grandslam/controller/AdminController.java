package com.application.grandslam.controller;

import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;


@Controller
public class AdminController {
    public static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    UserService userService;

    @GetMapping("/admin")
    public ModelAndView getAdminPage(@ModelAttribute("user") User user, HttpServletRequest request,HttpServletResponse response) {
        if(!Objects.equals((String) request.getSession().getAttribute("userRole"), "ADMIN")) {
            return new ModelAndView("showPlayers");
        }
        ModelAndView adminPage = new ModelAndView("admin");
        List<User> users = userService.listAllUsers();
        System.out.println("Users loaded...");
        adminPage.addObject("users", users);
        return adminPage;
    }

    @GetMapping("admin/edit/{id}")
       public ModelAndView getAdminEditPage (@PathVariable(name="id") Integer id) {
        ModelAndView adminEditPage = new ModelAndView("adminEdit");
        User user = userService.get(id);
        System.out.println("Admin Edit Loaded");
        adminEditPage.addObject("user", user);
        return adminEditPage;
    }

    @GetMapping("admin/delete/{id}")
    public String deleteUser (@PathVariable(name = "id") Integer userId) {
        ModelAndView page = new ModelAndView("admin");
        userService.delete(userId);
        System.out.println("User has been deleted");
        page.addObject("id", userId);
        return "redirect:/admin";
    }
}