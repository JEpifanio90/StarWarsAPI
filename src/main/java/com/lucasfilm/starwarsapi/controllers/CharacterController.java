package com.lucasfilm.starwarsapi.controllers;

import com.lucasfilm.starwarsapi.models.StarWarsCharacter;
import com.lucasfilm.starwarsapi.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/character")
public class CharacterController {
    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }


    @GetMapping
    public List<StarWarsCharacter> getCharacter(@RequestParam(value = "name", defaultValue = "world!") String name) {
        return characterService.getAllCharacters();
    }

}
