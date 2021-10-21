package com.application.grandslam.controller;

import com.application.grandslam.database.entities.Team;
import com.application.grandslam.database.repositories.TeamsRepo;
import com.application.grandslam.database.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TeamController
{
    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/")
    public ModelAndView listEmployees(@ModelAttribute("team") Team team)
    {
        ModelAndView model = new ModelAndView("team");

        List teamList = teamService.listAll();
        System.out.println(teamList);
        model.addObject("teamList", teamList);

        return model;
    }

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