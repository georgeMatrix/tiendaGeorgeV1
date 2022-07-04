package com.tiendaV1.tiendaGeorgeV1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Producto {
    private Long idProducto;
    private String nombre;
    private String descripcion;
    private Provedor provedor;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(idProducto, producto.idProducto) &&
                Objects.equals(nombre, producto.nombre) &&
                Objects.equals(descripcion, producto.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombre, descripcion);
    }

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_provedor", referencedColumnName = "id_provedor", nullable = false)
    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }
}
