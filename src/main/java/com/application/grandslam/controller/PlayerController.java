package com.application.grandslam.controller;

import com.application.grandslam.database.entities.Game;
import com.application.grandslam.database.entities.Stats;
import com.application.grandslam.database.entities.Team;
import com.application.grandslam.database.repositories.TeamsRepo;
import com.application.grandslam.database.services.StatService;
import com.application.grandslam.database.services.GameService;
import com.application.grandslam.database.services.TeamService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.application.grandslam.forms.PlayerForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PlayerController {

    @Autowired
    private TeamService teamService;

    @Autowired
    TeamsRepo teamRepository;

    @Autowired
    private StatService statsService;

    @Autowired
    private GameService gameService;

    @GetMapping("/players")
    public ModelAndView getPlayerTable() {

        List<Stats> playerStatsList = statsService.listAll();
        ModelAndView result = new ModelAndView("showPlayers");
        result.addObject("players", playerStatsList);
        return result;
    }

    @GetMapping("players/createplayer")
    public ModelAndView getPlayerTable(@ModelAttribute("PlayerForm") PlayerForm playerForm) {
        ModelAndView result = new ModelAndView("createPlayer");
        result.addObject("form", playerForm);
        return result;
    }

    @PostMapping("players/createplayer/addedPlayer")
    public ModelAndView postPlayerTable(@ModelAttribute("PlayerForm") PlayerForm playerForm) {
        ModelAndView result = new ModelAndView("createPlayer");
        result.addObject("form", playerForm);
        Stats playerStats = new Stats();
        Team team = new Team();
//		Game gameDetails = new Game();
        Integer numberusedForERAFormula = 9;

        double battingAverage = (double) playerForm.getHits() / playerForm.getAtBats();

        double formattedBattingAverage = (double) (Math.round(battingAverage * 1000.0) / 1000.0);

        playerStats.setPlayerId(playerForm.getPlayerId());

        playerStats.setName(playerForm.getName());

        playerStats.setAtBats(playerForm.getAtBats());

        playerStats.setAtBats(playerForm.getAtBats());

        playerStats.setHits(playerForm.getHits());

        playerStats.setRuns(playerForm.getRuns());

        playerStats.setTimesStruckOut(playerForm.getTimesStruckOut());

        playerStats.setHomeRuns(playerForm.getHits());

        playerStats.setDoubles(playerForm.getDoubles());

        playerStats.setTriples(playerForm.getTriples());

        playerStats.setRunsBattedIn(playerForm.getRunsBattedIn());

        playerStats.setWalks(playerForm.getWalks());

        playerStats.setTimesStruckOut(playerForm.getTimesStruckOut());

        playerStats.setBattingAverage(battingAverage);

        playerStats.setInningsPitched(playerForm.getInningsPitched());

        playerStats.setRunsAllowed(playerForm.getRunsAllowed());

        playerStats.setStrikeouts(playerForm.getStrikeouts());

//        team.setTeamId(teamService.getTeam(team.getTeamName()));
//        double earnedRunAverage = numberusedForERAFormula * playerForm.getRunsAllowed() / playerForm.getInningsPitched();

        playerStats.setBattingAverage(formattedBattingAverage);

//        if(teamService.existingTeam(playerForm.getTeamName())!= null) {
//            System.out.println(playerForm.getTeamName());
//            //set the existingTeam object's id to the existing idea in the team record
//            //how can I achieve this? Get the id of the record by the inputted Name
//            //Integer id = findIdByTeamName(playerForm.getTeamName())
//
////            teamRepository.save(existingTeam);
////            System.out.println(existingTeam.getNumberofPlayers());
//            System.out.println("Team already exists in the database!");
////            teamRepository.getTeamByNumberofPlayers(numberOfPlayers);
//        }
        Team addedTeam = teamRepository.findTeamByTeamName(playerForm.getTeamName());
        if(addedTeam != null) {
            addedTeam.setNumberofPlayers(addedTeam.getNumberofPlayers() + 1);
            playerStats.setTeam(addedTeam);
            statsService.save(playerStats);
        }

        Team newTeam = new Team();
        newTeam.setTeamName(playerForm.getTeamName());
        newTeam.setNumberofPlayers(1);
        playerStats.setTeam(newTeam);
        statsService.save(playerStats);
        teamService.save(newTeam);

        //I want to be able to know how many players are in a team to see if i can render a leaderboard for players in the same team
        //In order to achieve this I need to:
        //Save the players along with the team they belong to:
        //1.I need to save stats entity and team entity and then succesfully join the tables to show the team_id of that stats record
        //2. I need to be able to increment the column of numberofPlayers from the teams table whenever a created player enters a team name already in the database
        //3.Show the stats of every player from the team
        //Create a query in the team repository that joins team and stats
        //1. fix the entities to be able to write a custom query that joins the team entity with the stats entity on the team_id key
        //2.


//        if(teamService.getNumberofPlayers(team.getTeamName()) > 0) {
//            System.out.println("Team exists");
//            team.setNumberofPlayers(team.getNumberofPlayers() + 1);
//        }

        //STATS
        //stats_id atbats hits runs team_id
        //2         12     19   13      1

        //TEAMS
        //team_id team_name team_location number_of_players
        //1       Warriors  Chicago         0
        //

        //stats stats.getAtBats() -> 12 stats.getHits() -> 19 stats.getRuns()
        //stats.getRuns()-> 13 -> stats.getTeam() -> team.getId() -> 1 team.getName() -> Warriors team.getNumberofPlayers() -> 0 + 1 = 1


//		playerStats.teamId(team.getId());
//		gameDetails.setGameDate(playerForm.getGameDate());
//		gameDetails.setGameLocation(playerForm.getGameLocation());

        statsService.save(playerStats);
//		gameService.save(gameDetails);
        return result;

    }

//	Edit Player Controller

    @GetMapping("players/edit/{id}")
    public ModelAndView editPlayer(@PathVariable(name = "id") Integer id) {
        ModelAndView editPlayerPage = new ModelAndView("createPlayer");
        Stats stats = statsService.get(id);
        editPlayerPage.addObject("playersStats", stats);
        return editPlayerPage;
    }

    @GetMapping("players/delete/{id}")
    public ModelAndView deletePlayer(@PathVariable(name = "id") Integer id) {
        ModelAndView page = new ModelAndView("createPlayer");
        statsService.delete(id);
        System.out.println("User has been deleted");
        page.addObject("statsId", id);
        return page;
    }

//	@RequestMapping("/search")
//	public ModelAndView search(@RequestParam String keyword) {
//		List<Stats> result = (List<Stats>) statsService.search(keyword);
//		ModelAndView mav = new ModelAndView("search");
//		mav.addObject("result", result);
//
//		return mav;
//	}
}
