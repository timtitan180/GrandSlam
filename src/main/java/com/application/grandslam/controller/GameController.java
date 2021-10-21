//package com.application.grandslam.controller;
//
//import com.application.grandslam.database.daos.GameDAO;
//import com.application.grandslam.database.entities.Game;
//import com.application.grandslam.database.repositories.GameRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//@Controller
//public class GameController
//{
//
//    @Autowired
//    private GameRepository gameRepository;
//
//    @GetMapping(value="/createGames")
//    public ModelAndView getGamePage() {
//        return new ModelAndView("createGames");
//    }
//
////    @RequestMapping(value = "/game",method=RequestMethod.POST)
////    public ModelAndView saveGame(@ModelAttribute("game") Game game)
////    {
////        try
////        {
////            if(gameRepository.getById(game.getId()) != null);
////            gameRepository.save(game);
////        }
////        catch(EmptyResultDataAccessException e)
////        {
////            System.out.println("inside catch");
////            gameRepository.save(game);
////        }
////        return new ModelAndView("redirect:/game");
////    }
//
//    @RequestMapping(value = "/edit/{id}")
//    public ModelAndView editEmployee(@ModelAttribute("game") Game game,@PathVariable("id") int id)
//    {
//        ModelAndView model = new ModelAndView("game");
//
//        game = gameRepository.getById(id);
//        List<Game> gameList = gameRepository.ListAll();
//
//        model.addObject("game",game);
//        model.addObject("gameList",gameList);
//
//        return model;
//    }
//
//    @GetMapping("/delete/{id}")
//    public ModelAndView deleteGame(@ModelAttribute("game") Game game,@PathVariable("id") Integer id)
//    {
//        gameRepository.deleteById(id);
//
//        return new ModelAndView("redirect:/game");
//    }
//
//    @RequestMapping(value = "/games")
//    public ModelAndView listGames(@ModelAttribute("game") Game game)
//    {
//        ModelAndView model = new ModelAndView("game");
//
//        List gameList = gameRepository.ListAll();
//        System.out.println(gameList);
//        model.addObject("gameList", gameList);
//
//        return model;
//    }
//}
