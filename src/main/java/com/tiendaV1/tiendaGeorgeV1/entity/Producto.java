package com.tiendaV1.tiendaGeorgeV1.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "producto", schema = "tienda", catalog = "")
public class Producto {
    private Long idProducto;
    private String nombre;
    private String descripcion;

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
    public int hashCode() {
        return Objects.hash(idProducto, nombre, descripcion);
    }
}
