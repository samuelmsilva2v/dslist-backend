package com.devsuperior.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.application.dtos.GameDto;
import com.devsuperior.application.dtos.GameMinDto;
import com.devsuperior.domain.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping("/{id}")
	public GameDto findById(@PathVariable Long id) {
		GameDto result = gameService.findById(id);
		return result;
	}

	@GetMapping
	public List<GameMinDto> findAll() {
		List<GameMinDto> result = gameService.findAll();
		return result;
	}
}
