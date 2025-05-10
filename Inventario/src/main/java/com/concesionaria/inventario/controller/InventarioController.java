package com.concesionaria.inventario.controller;

import com.concesionaria.inventario.model.Inventario;
import com.concesionaria.inventario.model.Venta;
import com.concesionaria.inventario.repository.InventarioRepository;
import com.concesionaria.inventario.repository.VentaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InventarioController {

    private final InventarioRepository inventarioRepository;
    private final VentaRepository ventaRepository;

    public InventarioController(InventarioRepository inventarioRepository, VentaRepository ventaRepository) {
        this.inventarioRepository = inventarioRepository;
        this.ventaRepository = ventaRepository;
    }

    // Get inventory
    @GetMapping("/inventario/sucursal/{id}")
    public List<Inventario> obtenerInventarioPorSucursal(@PathVariable Long id) {
        return inventarioRepository.findBySucursalIdSucursal(id);
    }

    // Get sales from car model
    @GetMapping("/ventas/carro/{modelo}")
    public List<Venta> obtenerVentasPorModelo(@PathVariable String modelo) {
        return ventaRepository.findByCarroModelo(modelo);
    }
}
