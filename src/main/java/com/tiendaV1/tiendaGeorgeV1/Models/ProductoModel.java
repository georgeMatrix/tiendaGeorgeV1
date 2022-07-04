package com.tiendaV1.tiendaGeorgeV1.Models;

import com.tiendaV1.tiendaGeorgeV1.entity.Provedor;

public class ProductoModel {
    private String nombre;
    private String descripcion;
    private Long idprovedor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdprovedor() {
        return idprovedor;
    }

    public void setIdprovedor(Long idprovedor) {
        this.idprovedor = idprovedor;
    }
}
