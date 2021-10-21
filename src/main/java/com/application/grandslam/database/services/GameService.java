package com.application.grandslam.database.services;

import java.util.List;

import com.application.grandslam.database.entities.Game;
import com.application.grandslam.database.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> listAll() {
        return (List<Game>)gameRepository.findAll();
    }

    public void save(Game game) {
        gameRepository.save(game);
    }

    public Game get(Integer id) {
        return gameRepository.findById(id).get();
    }

}