package com.cyanpc.dslist.service;

import com.cyanpc.dslist.dto.GameListDTO;
import com.cyanpc.dslist.dto.GameMinDTO;
import com.cyanpc.dslist.entity.GameList;
import com.cyanpc.dslist.projection.GameMinProjection;
import com.cyanpc.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList(); 

    }

}
