package com.concesionaria.inventario.repository;

import com.concesionaria.inventario.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
}
