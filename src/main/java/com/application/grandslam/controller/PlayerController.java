package com.application.grandslam.controller;
import com.application.grandslam.database.entities.Game;
import com.application.grandslam.database.entities.Stats;
import com.application.grandslam.database.services.StatService;
import com.application.grandslam.database.services.GameService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.application.grandslam.forms.PlayerForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PlayerController {

	@Autowired
	private StatService statsService;

	@Autowired
	private GameService gameService;

	@GetMapping("/players")
	public ModelAndView getPlayerTable() {

		List<Stats> playerStatsList = statsService.listAll();
		ModelAndView result = new ModelAndView("showPlayers");
		result.addObject("players",playerStatsList);
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
		Game gameDetails = new Game();
		double battingAverage = (double)playerForm.getHits()/playerForm.getAtBats();
		double formattedBattingAverage = (double) (Math.round(battingAverage*1000.0)/1000.0);
		System.out.println(formattedBattingAverage);
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
//		double earnedRunAverage = (double) 9 * playerForm.getRunsAllowed()/playerForm.getInningsPitched();
		playerStats.setBattingAverage(formattedBattingAverage);
//		gameDetails.setGameDate(playerForm.getGameDate());
		gameDetails.setGameLocation(playerForm.getGameLocation());

		statsService.save(playerStats);
		gameService.save(gameDetails);
		return result;

	}

//	Edit Player Controller

	@GetMapping("players/edit/{id}")
	public ModelAndView editPlayer(@PathVariable(name="id") Integer id) {
		ModelAndView editPlayerPage = new ModelAndView("createPlayer");
		Stats stats = statsService.get(id);
		editPlayerPage.addObject("playersStats",stats);
		return editPlayerPage;
	}

	@GetMapping("players/delete/{id}")
	public ModelAndView deletePlayer(@PathVariable(name="id") Integer id) {
		ModelAndView page = new ModelAndView("createPlayer");
		statsService.delete(id);
		System.out.println("User has been deleted");
		page.addObject("statsId",id);
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
