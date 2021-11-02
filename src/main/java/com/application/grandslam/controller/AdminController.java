package com.application.grandslam.controller;

import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    UserService userService;

    @GetMapping("/admin")
    public ModelAndView getAdminPage(@ModelAttribute("user") User user) {
        ModelAndView response = new ModelAndView("admin");
        List<User> users = userService.listAllUsers();
        System.out.println("Users loaded...");
        response.addObject("users", users);
        return response;
    }

    @GetMapping("admin/edit/{id}")
       public ModelAndView getAdminEditPage (@PathVariable(name="id") Integer id) {
        ModelAndView adminEditPage = new ModelAndView("adminEdit");
        User user = userService.get(id);
        System.out.println("Admin Edit Loaded");
        adminEditPage.addObject("user", user);
        return adminEditPage;
    }
//
//    @PostMapping("/admin/edit/post")
//    publi

    @GetMapping("admin/delete/{id}")
    public ModelAndView getAdminDelete(@PathVariable(name="id") Integer id, HttpServletRequest request) {
        ModelAndView adminPage = new ModelAndView("admin");
        userService.delete(id);
        adminPage.addObject("id",id);
        System.out.println("User was deleted successfully");
        return adminPage;
    }
}