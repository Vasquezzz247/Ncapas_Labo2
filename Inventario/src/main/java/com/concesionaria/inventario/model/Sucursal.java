package com.concesionaria.inventario.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "sucursal")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSucursal;

    private String nombre;
    private String ubicacion;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Inventario> inventario;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Venta> ventas;

    // Getters and Setters

    public Long getIdsucursal() {
        return idSucursal;
    }

    public void setIdsucursal(Long id_sucursal) {
        this.idSucursal = id_sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
