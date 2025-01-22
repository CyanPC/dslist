package com.cyanpc.dslist.controller;

import com.cyanpc.dslist.dto.GameDTO;
import com.cyanpc.dslist.entity.Game;
import com.cyanpc.dslist.repository.GameRepository;
import com.cyanpc.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll() {
        {
            List<GameDTO> result = gameService.findAll();
            return result;
        }
    }

}
