package com.tiendaV1.tiendaGeorgeV1.service;

import com.tiendaV1.tiendaGeorgeV1.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> clientes();
    Cliente create(Cliente cliente);
}
