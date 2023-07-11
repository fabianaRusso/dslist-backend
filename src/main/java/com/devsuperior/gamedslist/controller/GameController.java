package com.devsuperior.gamedslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.gamedslist.dto.GameMinDTO;
import com.devsuperior.gamedslist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	
	@GetMapping
	public List<GameMinDTO> buscarTodos(){
		return service.buscarTodos();
	}
}
