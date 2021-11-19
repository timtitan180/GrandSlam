package com.application.grandslam.database.repositories;

import com.application.grandslam.database.entities.Role;
import com.application.grandslam.database.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface UserRepository extends CrudRepository<User,Integer> {
        @Query("select u from User u where u.email = :email")
        User findByEmail(String email);

        Role save(Role role);
//
//        @Query("select ur from UserRole ur where ur.userId = :userId")
//        List<UserRole> getUserRoles(Integer userId);
}
