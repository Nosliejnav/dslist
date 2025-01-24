package br.com.vanjeilson.dslist.services;

import br.com.vanjeilson.dslist.dto.GameDTO;
import br.com.vanjeilson.dslist.dto.GameListDTO;
import br.com.vanjeilson.dslist.dto.GameMinDTO;
import br.com.vanjeilson.dslist.entities.Game;
import br.com.vanjeilson.dslist.entities.GameList;
import br.com.vanjeilson.dslist.repositories.GameListRepository;
import br.com.vanjeilson.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Component
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
