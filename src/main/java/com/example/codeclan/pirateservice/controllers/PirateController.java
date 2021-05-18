package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

@RestController
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

//    INDEX
    @GetMapping(value="/pirates")
    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

//    SHOW
    @GetMapping(value="/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id) {
        return pirateRepository.findById(id);
    }


}
