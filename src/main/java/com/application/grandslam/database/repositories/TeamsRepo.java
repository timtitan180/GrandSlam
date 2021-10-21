package com.application.grandslam.database.repositories;

import com.application.grandslam.database.entities.Team;
import org.springframework.data.repository.CrudRepository;

//Had to shorten the name of the repo due to a problem with the JVM not being able to parse the file
public interface TeamsRepo extends CrudRepository<Team,Long> {
}
