package com.devsuperior.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domain.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
