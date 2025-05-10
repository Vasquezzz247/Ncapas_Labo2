package com.concesionaria.inventario.repository;

import com.concesionaria.inventario.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    List<Venta> findByCarroModelo(String modelo);
}
