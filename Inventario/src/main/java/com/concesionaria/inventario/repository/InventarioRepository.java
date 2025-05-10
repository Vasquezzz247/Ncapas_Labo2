package com.concesionaria.inventario.repository;

import com.concesionaria.inventario.model.Inventario;
import com.concesionaria.inventario.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
    List<Inventario> findBySucursalIdSucursal(Long idSucursal); // ✅ CORRECTO
}
