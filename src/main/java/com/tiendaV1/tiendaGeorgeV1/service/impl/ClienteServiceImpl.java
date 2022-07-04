package com.tiendaV1.tiendaGeorgeV1.service.impl;

import com.tiendaV1.tiendaGeorgeV1.entity.Cliente;
import com.tiendaV1.tiendaGeorgeV1.repository.ClienteRepository;
import com.tiendaV1.tiendaGeorgeV1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
