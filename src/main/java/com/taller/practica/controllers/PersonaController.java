package com.taller.practica.controllers;

import com.taller.practica.entities.Persona;
import com.taller.practica.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping
    public ResponseEntity<List<Persona>> findAll() {
        List<Persona> list = personaRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
