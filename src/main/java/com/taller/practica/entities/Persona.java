package com.taller.practica.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @Embedded
    private Direccion direccion;
    @OneToMany
    @JoinColumn(name = "persona_id")
    private Set<Telefono> telefono;
}
