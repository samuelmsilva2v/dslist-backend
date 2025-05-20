package com.devsuperior.application.dtos;

import org.springframework.beans.BeanUtils;

import com.devsuperior.domain.entities.GameList;

import lombok.Data;

@Data
public class GameListDto {

	private Long id;
	private String name;
	
	public GameListDto(GameList entity) {
		BeanUtils.copyProperties(entity, this);
	}
}
