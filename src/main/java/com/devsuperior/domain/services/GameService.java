package com.devsuperior.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.application.dtos.GameDto;
import com.devsuperior.application.dtos.GameMinDto;
import com.devsuperior.application.projections.GameMinProjection;
import com.devsuperior.domain.entities.Game;
import com.devsuperior.infrastructure.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDto(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDto> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDto(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDto(x)).toList();
	}
}
