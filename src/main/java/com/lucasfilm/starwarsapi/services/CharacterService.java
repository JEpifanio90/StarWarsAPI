package com.lucasfilm.starwarsapi.services;

import com.lucasfilm.starwarsapi.models.StarWarsCharacter;
import com.lucasfilm.starwarsapi.repositories.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<StarWarsCharacter> getAllCharacters() {
        return characterRepository.findAll();
    }
}
