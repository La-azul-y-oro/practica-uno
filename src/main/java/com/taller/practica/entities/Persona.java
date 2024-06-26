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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToMany(mappedBy = "personas")
    private Set<DireccionEntity> direcciones;
    @Embedded
    private Direccion direccion;
    @OneToMany
    @JoinColumn(name = "persona_id")
    private Set<Telefono> telefono;
}
