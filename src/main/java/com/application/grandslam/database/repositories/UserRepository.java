package com.application.grandslam.database.repositories;

import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.entities.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface UserRepository extends CrudRepository<User,Integer> {
        User findByEmail(String email);

        @Query("select ur from UserRole ur where ur.user.id = :userId")
        List<UserRole> getUserRoles(Integer userId);
}
