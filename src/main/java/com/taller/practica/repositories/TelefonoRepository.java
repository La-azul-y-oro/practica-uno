package com.taller.practica.repositories;

import com.taller.practica.entities.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonoRepository extends JpaRepository<Telefono, Integer> {
}
