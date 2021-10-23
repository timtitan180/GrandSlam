package com.application.grandslam.database.repositories;

import com.application.grandslam.database.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Had to shorten the name of the repo due to a problem with the JVM not being able to parse the file
public interface TeamsRepo extends CrudRepository<Team,Integer> {
    @Query(value="SELECT COUNT(t) FROM Team t")
    Integer CountTeams();
}