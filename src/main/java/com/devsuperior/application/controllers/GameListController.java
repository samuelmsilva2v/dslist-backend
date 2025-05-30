package com.devsuperior.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.application.dtos.GameListDto;
import com.devsuperior.application.dtos.GameMinDto;
import com.devsuperior.application.dtos.ReplacementDto;
import com.devsuperior.domain.services.GameListService;
import com.devsuperior.domain.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDto> findAll() {
		List<GameListDto> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping("/{listId}/games")
	public List<GameMinDto> findByList(@PathVariable Long listId) {
		List<GameMinDto> result = gameService.findByList(listId);
		return result;
	}
	
	@Transactional
	@PostMapping("/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDto body) {
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
}
