package com.devsuperior.application.dtos;

import com.devsuperior.application.projections.GameMinProjection;
import com.devsuperior.domain.entities.Game;

import lombok.Data;

@Data
public class GameMinDto {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDto(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameMinDto(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
}
