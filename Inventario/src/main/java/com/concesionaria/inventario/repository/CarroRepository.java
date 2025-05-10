package com.concesionaria.inventario.repository;

import com.concesionaria.inventario.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
