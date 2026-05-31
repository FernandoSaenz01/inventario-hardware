package com.estudiante.proyecto.inventario.hardware.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HardwareEntity {

    private Long id;
    private String modelo;
    private String categoria;
    private BigDecimal precio;
    private LocalDate fechaCompra;
    private String estado;

    public HardwareEntity() {
    }

    public HardwareEntity(Long id, String modelo, String categoria,
                          BigDecimal precio, LocalDate fechaCompra,
                          String estado) {
        this.id = id;
        this.modelo = modelo;
        this.categoria = categoria;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
