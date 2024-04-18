package com.taller.practica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.practica.entities.Dvd;
import com.taller.practica.entities.Libro;
import com.taller.practica.repositories.ProductoRepository;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("/libro")
    public ResponseEntity<Void> createLibro(@RequestBody Libro producto) {
        productoRepository.save(producto);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PostMapping("/dvd")
    public ResponseEntity<Void> createDvd(@RequestBody Dvd producto) {
        productoRepository.save(producto);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
