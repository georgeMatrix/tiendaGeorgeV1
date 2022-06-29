package com.tiendaV1.tiendaGeorgeV1.controllers;

import com.tiendaV1.tiendaGeorgeV1.entity.Producto;
import com.tiendaV1.tiendaGeorgeV1.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/producto")
    public List<Producto> getProducto(){
     return productoService.productos();
    }
}
