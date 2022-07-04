package com.tiendaV1.tiendaGeorgeV1.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "provedor", schema = "tienda", catalog = "")
public class Provedor {
    private Long idProvedor;
    private String nombre;
    private String telefono;
    private String empresa;
    private List<Producto> productos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provedor")
    public Long getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Long idProvedor) {
        this.idProvedor = idProvedor;
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
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "empresa")
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provedor that = (Provedor) o;
        return Objects.equals(idProvedor, that.idProvedor) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(telefono, that.telefono) &&
                Objects.equals(empresa, that.empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProvedor, nombre, telefono, empresa);
    }

    @OneToMany(mappedBy = "provedor")
    @JsonManagedReference
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
