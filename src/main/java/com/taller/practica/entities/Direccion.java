package com.taller.practica.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Direccion {
    private String calle;
    private Integer numero;
}
