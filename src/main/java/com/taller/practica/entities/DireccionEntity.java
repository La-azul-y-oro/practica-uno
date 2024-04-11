package com.taller.practica.entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DireccionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String calle;
    private Integer numero;
    @ManyToMany
    @JoinTable(
        name = "rel_direccion_persona",
        joinColumns = @JoinColumn(name = "FK_DIRECCION", nullable = false),
        inverseJoinColumns = @JoinColumn(name="FK_PERSONA", nullable = false)
    )
    private Set<Persona> personas;
}
