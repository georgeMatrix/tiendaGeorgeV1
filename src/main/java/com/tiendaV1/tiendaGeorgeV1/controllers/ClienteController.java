package com.tiendaV1.tiendaGeorgeV1.controllers;

import com.tiendaV1.tiendaGeorgeV1.entity.Cliente;
import com.tiendaV1.tiendaGeorgeV1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    List<Cliente> getClientes(){
        return clienteService.clientes();
    }

    @PostMapping("/cliente")
    Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.create(cliente);
    }
}
