package com.application.grandslam.database.services;

import java.util.List;

import com.application.grandslam.database.entities.Team;
import com.application.grandslam.database.repositories.TeamsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamService {

    @Autowired
    private TeamsRepo teamRepository;

    public List<Team> listAll() {
        return (List<Team>)teamRepository.findAll();
    }

    public void save(Team team) {
        teamRepository.save(team);
    }

    public Team get(Integer id) {
        return teamRepository.findById(id).get();
    }

    public void delete(Integer id) {
        teamRepository.deleteById(id);
    }

    public Integer countTeamNames() {
        return teamRepository.CountTeams();
    }
}