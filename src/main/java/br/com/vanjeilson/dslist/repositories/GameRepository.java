package br.com.vanjeilson.dslist.repositories;

import br.com.vanjeilson.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
