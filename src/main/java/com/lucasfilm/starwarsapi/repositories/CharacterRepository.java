package com.lucasfilm.starwarsapi.repositories;

import com.lucasfilm.starwarsapi.models.StarWarsCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<StarWarsCharacter, Long> {
}
