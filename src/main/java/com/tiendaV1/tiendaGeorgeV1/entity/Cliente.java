package com.tiendaV1.tiendaGeorgeV1.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cliente {
    private Long idCliente;
    private String nombre;
    private String apellido;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente) &&
                Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(apellido, cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, apellido);
    }
}
