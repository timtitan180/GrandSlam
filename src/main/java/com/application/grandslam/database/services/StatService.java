package com.application.grandslam.database.services;

import java.util.List;

import com.application.grandslam.database.entities.Stats;
import com.application.grandslam.database.repositories.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StatService {

    @Autowired
    private StatsRepository statRepository;

    public List<Stats> listAll() {
        return (List<Stats>)statRepository.findAll();
    }

    public void save(Stats stat) {
        statRepository.save(stat);
    }

    public Stats get(Integer id) {
        return statRepository.findById(id).get();
    }

    public void delete(Integer statsId) {
        statRepository.deleteById(statsId);
    }

//    public List<Stats> search(String keyword) {
//        return statRepository.search(keyword);
//    }
}