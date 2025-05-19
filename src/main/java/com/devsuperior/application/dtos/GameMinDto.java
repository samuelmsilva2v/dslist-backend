package com.devsuperior.application.dtos;

import com.devsuperior.domain.entities.Game;

import lombok.Data;

@Data
public class GameMinDto {

	private Long id;
	private String title;
	private String year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDto(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
}
