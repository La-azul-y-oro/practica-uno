package com.taller.practica.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Libro extends Producto{
    private String isbn;
}
