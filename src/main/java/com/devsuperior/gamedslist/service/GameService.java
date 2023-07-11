package com.devsuperior.gamedslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.gamedslist.dto.GameMinDTO;
import com.devsuperior.gamedslist.entities.Game;
import com.devsuperior.gamedslist.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> buscarTodos() {

		List<Game> games = gameRepository.findAll();
		List<GameMinDTO> dtos = games.stream().map(x -> new GameMinDTO(x)).toList();

		return dtos;

	}
}
