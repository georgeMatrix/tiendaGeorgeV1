package com.tiendaV1.tiendaGeorgeV1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    @GetMapping("/producto")
    public String getProducto(){
     return "llegando";
    }
}
