package com.victort7.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victort7.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	
	
}
