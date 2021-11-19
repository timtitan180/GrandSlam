package com.application.grandslam.database.services;
import java.util.List;

import com.application.grandslam.database.entities.Role;
import com.application.grandslam.database.repositories.UserRepository;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;


import com.application.grandslam.database.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;

@Service
@Transactional
@RequestMapping("users/")
public class UserService  {
    @Autowired
    UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
        }

    public void save(Role role) {
        userRepository.save(role);
    }

    public List<User> listAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    public User get(Integer id) {
        return userRepository.findById(id).get();
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

}
