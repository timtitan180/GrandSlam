package com.application.grandslam.controller;

import com.application.grandslam.database.entities.Team;
import com.application.grandslam.database.repositories.TeamsRepo;
import com.application.grandslam.database.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TeamController
{
    @Autowired
    TeamService teamService;

    @GetMapping("teams")
    public ModelAndView listEmployees(@ModelAttribute("team") Team team)
    {
        ModelAndView model = new ModelAndView("team");
        System.out.println(teamService.countTeamNames());
        List teamList = teamService.listAll();
        System.out.println(team);
        model.addObject("teams", teamList);

        return model;
    }
//    @PostMapping()

    //@PutMapping()

    //@DeleteMapping()

    @RequestMapping(value = "/team",method=RequestMethod.POST)
    public ModelAndView saveTeam(@ModelAttribute("team") Team team)
    {
        try
        {
            if(teamService.get(team.getId()) != null);
            teamService.save(team);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            teamService.save(team);
        }
        return new ModelAndView("redirect:/team");
    }

    @GetMapping("teams/addTeam")
    public ModelAndView getAddedTeamPage() {
        ModelAndView result = new ModelAndView();
        result.setViewName("teams");
        return result;
    }

    @PostMapping("teams/addTeam")
    public ModelAndView postAddedTeamPage(@ModelAttribute("Team") Team team,@RequestParam("teamName") String teamName,@RequestParam("numberofPlayers") Integer numberofPlayers) {
        ModelAndView result = new ModelAndView("teams");
        Team newTeam = new Team();
        result.addObject("team",team);
        System.out.println(teamName);
        System.out.println(numberofPlayers);
        newTeam.setTeamName(teamName);
        newTeam.setNumberofPlayers(numberofPlayers);
        teamService.save(newTeam);
        return result;

    }

    @GetMapping("countTeams")
    public ModelAndView countTeamsPage() {
        ModelAndView result = new ModelAndView("teams");
        if(teamService.countTeamNames() < 12) {
            System.out.println("Please create more teams to rank them in a leaderboard");
        }
        return result;
    }

    //@RequestParam("teamName") String teamName,@RequestParam("numberofPlayers") Integer numberofPlayers

    @RequestMapping(value = "/editteam/{id}")
    public ModelAndView editEmployee(@ModelAttribute("team") Team team, @PathVariable("id") Integer teamId)
    {
        ModelAndView model = new ModelAndView("team");

        team = teamService.get(teamId);
        List teamList = teamService.listAll();

        model.addObject("team",team);
        model.addObject("teamList",teamList);

        return model;
    }

    @RequestMapping(value = "/deleteteam/{id}")
    public ModelAndView deleteEmployee(@ModelAttribute("employee") Team team,@PathVariable("id") int id)
    {
        teamService.delete(id);

        return new ModelAndView("redirect:/");
    }

}