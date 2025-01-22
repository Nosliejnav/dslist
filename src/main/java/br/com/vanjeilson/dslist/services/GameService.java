package br.com.vanjeilson.dslist.services;

import br.com.vanjeilson.dslist.dto.GameMinDTO;
import br.com.vanjeilson.dslist.entities.Game;
import br.com.vanjeilson.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
//        var result = gameRepository.findAll();
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
//        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
//        return dto;
    }
}
