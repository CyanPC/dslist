package com.cyanpc.dslist.service;

import com.cyanpc.dslist.dto.GameDTO;
import com.cyanpc.dslist.entity.Game;
import com.cyanpc.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
        return dto;

    }
}
