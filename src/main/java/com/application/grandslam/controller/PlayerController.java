package com.application.grandslam.controller;

import com.application.grandslam.database.entities.Game;
import com.application.grandslam.database.entities.Stats;
import com.application.grandslam.database.entities.Team;
import com.application.grandslam.database.services.StatService;
import com.application.grandslam.database.services.GameService;
import com.application.grandslam.database.services.TeamService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.application.grandslam.forms.PlayerForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private TeamService teamService;

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

        team.setTeamName(playerForm.getTeamName());
        team.setTeamId(2);
        team.setNumberofPlayers(1);
        playerStats.setTeam(team);
        System.out.println(team.toString());
        //
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

        System.out.println(playerStats.getTeam());

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
