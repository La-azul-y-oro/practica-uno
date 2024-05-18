package com.taller.practica.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dvd extends Producto{
    private Integer duracion;
}
