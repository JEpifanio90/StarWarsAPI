package com.lucasfilm.starwarsapi.configs;

import com.lucasfilm.starwarsapi.models.StarWarsCharacter;
import com.lucasfilm.starwarsapi.repositories.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StarWarsCharacterConfig {
    @Bean
    CommandLineRunner commandLineRunner(CharacterRepository characterRepository) {
        return args -> {
            StarWarsCharacter luke = new StarWarsCharacter("Luke Skywalker", true);
            StarWarsCharacter anakin = new StarWarsCharacter("Anakin Skywalker", true);
            StarWarsCharacter malgus = new StarWarsCharacter("Darth Revan", true);
            StarWarsCharacter revan = new StarWarsCharacter("Darth Malgus", true);
            StarWarsCharacter han = new StarWarsCharacter("Han Solo", true);
            StarWarsCharacter r2 = new StarWarsCharacter("R2-D2", true);
            StarWarsCharacter c3 = new StarWarsCharacter("C3PO", true);

            characterRepository.saveAll(List.of(luke, anakin, malgus, revan, han, r2, c3));
        };
    }
}
