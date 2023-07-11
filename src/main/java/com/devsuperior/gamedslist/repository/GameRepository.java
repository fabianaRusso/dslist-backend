package com.devsuperior.gamedslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gamedslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
