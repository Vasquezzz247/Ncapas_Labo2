package com.concesionaria.inventario.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carro;

    private String modelo;
    private String marca;
    private int anio;
    private double precio;

    @OneToMany(mappedBy = "carro", cascade = CascadeType.ALL)
    private List<Inventario> inventario;

    @OneToMany(mappedBy = "carro", cascade = CascadeType.ALL)
    private List<Venta> ventas;

    // Getters and Setters

    public Long getId_carro() {
        return id_carro;
    }

    public void setId_carro(Long id_carro) {
        this.id_carro = id_carro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
