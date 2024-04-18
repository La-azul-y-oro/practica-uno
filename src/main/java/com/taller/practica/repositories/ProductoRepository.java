package com.taller.practica.repositories;

import com.taller.practica.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
