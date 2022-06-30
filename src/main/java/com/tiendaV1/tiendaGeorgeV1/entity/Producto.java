package com.tiendaV1.tiendaGeorgeV1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "producto", schema = "tienda", catalog = "")
public class Producto {
    private Long idProducto;
    private String nombre;
    private String descripcion;
    private Provedor provedorByIdProvedor;

    @Id
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
        Producto that = (Producto) o;
        return Objects.equals(idProducto, that.idProducto) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombre, descripcion);
    }

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_provedor", referencedColumnName = "id_provedor", nullable = false)
    public Provedor getProvedorByIdProvedor() {
        return provedorByIdProvedor;
    }

    public void setProvedorByIdProvedor(Provedor provedorByIdProvedor) {
        this.provedorByIdProvedor = provedorByIdProvedor;
    }
}
