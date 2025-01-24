package br.com.vanjeilson.dslist.services;

import br.com.vanjeilson.dslist.dto.GameDTO;
import br.com.vanjeilson.dslist.dto.GameMinDTO;
import br.com.vanjeilson.dslist.entities.Game;
import br.com.vanjeilson.dslist.projections.GameMinProjection;
import br.com.vanjeilson.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO fyndById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
//        GameDTO dto = new GameDTO(result);
//        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
//        var result = gameRepository.findAll();
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
//        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
//        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
