package com.devsuperior.application.dtos;

import org.springframework.beans.BeanUtils;

import com.devsuperior.domain.entities.Game;

import lombok.Data;

@Data
public class GameDto {

	private Long id;
	private String title;
	private String year;
	private String genre;
	private String platforms;
	private String score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDto(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
}
