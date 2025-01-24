package br.com.vanjeilson.dslist.repositories;

import br.com.vanjeilson.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {


}
