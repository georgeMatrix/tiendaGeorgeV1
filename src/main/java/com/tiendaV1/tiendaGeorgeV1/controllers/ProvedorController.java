package com.tiendaV1.tiendaGeorgeV1.controllers;

import com.tiendaV1.tiendaGeorgeV1.entity.Provedor;
import com.tiendaV1.tiendaGeorgeV1.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProvedorController {
    @Autowired
    private ProvedorService provedorService;


    @GetMapping("provedor")
    public List<Provedor> getProvedores(){
        return provedorService.Provedores();
    }
}
