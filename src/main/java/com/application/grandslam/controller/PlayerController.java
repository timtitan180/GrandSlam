package com.application.grandslam.controller;

import com.application.grandslam.database.entities.Game;
import com.application.grandslam.database.entities.Stats;
import com.application.grandslam.database.entities.Team;
import com.application.grandslam.database.repositories.TeamsRepo;
import com.application.grandslam.database.services.StatService;
import com.application.grandslam.database.services.GameService;
import com.application.grandslam.database.services.TeamService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.application.grandslam.forms.PlayerForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

//
//@PreAuthorize('isAuthenticated("COACH")')

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

    @GetMapping("players")
    public ModelAndView getPlayerTable(HttpServletRequest request) {
        System.out.println(request.getSession().getAttribute("userRole"));
        List<Stats> playerStatsList = statsService.listAll();
        System.out.println(playerStatsList.toString());
        ModelAndView result = new ModelAndView("showPlayers");
        result.addObject("players", playerStatsList);
        return result;
    }

    @GetMapping("players/createplayer")
    public String getPlayerTable(HttpServletRequest request,@ModelAttribute("PlayerForm") PlayerForm playerForm) {
        System.out.println(request.getSession().getAttribute("userRole"));
        List<Stats> playerStatsList = statsService.listAll();
        ModelAndView result = new ModelAndView("showPlayers");
        result.addObject("players", playerStatsList);
        result.addObject("form", playerForm);
        return "redirect:/players";
    }


    @PostMapping("players/createplayer")
    public ModelAndView postPlayerTable(HttpServletRequest request,@ModelAttribute("PlayerForm") PlayerForm playerForm) {
        System.out.println(request.getSession().getAttribute("userRole"));
        List<Stats> playerStatsList = statsService.listAll();
        ModelAndView result = new ModelAndView("showPlayers");
        result.addObject("form", playerForm);
        Stats playerStats = new Stats();
        Team team = new Team();
		Game gameDetails = new Game();
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

        Team addedTeam = teamRepository.findTeamByTeamName(playerForm.getTeamName());
        if(addedTeam != null) {
            addedTeam.setNumberofPlayers(addedTeam.getNumberofPlayers() + 1);
            playerStats.setTeam(addedTeam);
            statsService.save(playerStats);
            gameDetails.setGameLocation(playerForm.getGameLocation());
            gameService.save(gameDetails);
        }

            Team newTeam = new Team();
            newTeam.setTeamName(playerForm.getTeamName());
            newTeam.setNumberofPlayers(1);
            playerStats.setTeam(newTeam);
            statsService.save(playerStats);
            teamService.save(newTeam);
            gameDetails.setGameLocation(playerForm.getGameLocation());
            gameDetails.setGameDate(playerForm.getGameDate());
            gameService.save(gameDetails);

             result.addObject("players",playerStatsList);


//        if(teamService.getNumberofPlayers(team.getTeamName()) > 0) {
//            System.out.println("Team exists");
//            team.setNumberofPlayers(team.getNumberofPlayers() + 1);
//        }

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

//    @GetMapping("players/delete/{id}")
//    public ModelAndView getDeletePlayer (@PathVariable(name="id") Integer id) {
//        ModelAndView page = new ModelAndView("showPlayers");
//        page.addObject("statsId", id);
//        return page;
//    }
    @GetMapping("players/delete/{id}")
    public String deletePlayer (@PathVariable(name = "id") Integer statsId) {
        ModelAndView page = new ModelAndView("showPlayers");
        statsService.delete(statsId);
        System.out.println("User has been deleted");
        page.addObject("statsId", statsId);
        return "redirect:/players";
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
