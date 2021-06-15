package com.lucasfilm.starwarsapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class StarWarsCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    private boolean forceUser;

    public StarWarsCharacter(String name, Boolean forceUser) {
        this.name = name;
        this.forceUser = forceUser;
    }

    public StarWarsCharacter() {
    }
}
