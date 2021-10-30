package com.application.grandslam.database.repositories;

import com.application.grandslam.database.entities.Stats;
import com.application.grandslam.database.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Had to shorten the name of the repo due to a problem with the JVM not being able to parse the file
public interface TeamsRepo extends CrudRepository<Team,Integer> {
    @Query(value="SELECT COUNT(t) FROM Team t")
    Integer CountTeams();

    @Query(value="SELECT t.numberofPlayers from Team t WHERE t.teamName = :teamName")
    Integer getNumberofPlayers(String teamName);

    Team getTeamByTeamName(String teamName);

    @Query(value="SELECT t from Team t WHERE t.teamName = :teamName")
    Team findByName(String teamName);

    @Query(value="SELECT t from Team t WHERE t.teamName = :teamName")
    Team findTeamByTeamName(String teamName);

    Team findByteamName(String teamName);

////    @Query("SELECT t.teamName from Team t inner join Stats s on s.team = t.teamId")
//     Team getTeamByStatsAndTeamId(Stats s);
//
//
//     Integer getTeamIdByTeamName(String teamName);

    //input Team
    //getTeamNameById()
    //Warriors-> 2;
    //stats.getTeamId(2);
    //getplayersteam by id -> 2 -> Warriors -> get count of team_id -> 2
}