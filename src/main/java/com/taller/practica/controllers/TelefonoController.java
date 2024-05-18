package com.taller.practica.controllers;

import com.taller.practica.entities.Telefono;
import com.taller.practica.repositories.TelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {
    @Autowired
    private TelefonoRepository telefonoRepository;

    @GetMapping
    public ResponseEntity<List<Telefono>> findAll() {
        List<Telefono> list = telefonoRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
