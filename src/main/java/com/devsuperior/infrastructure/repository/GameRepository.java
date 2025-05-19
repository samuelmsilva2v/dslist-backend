package com.devsuperior.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domain.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
