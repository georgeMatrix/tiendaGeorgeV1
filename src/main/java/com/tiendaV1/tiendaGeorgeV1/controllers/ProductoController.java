package com.tiendaV1.tiendaGeorgeV1.controllers;

import com.tiendaV1.tiendaGeorgeV1.Models.ProductoModel;
import com.tiendaV1.tiendaGeorgeV1.converters.ProductoConverter;
import com.tiendaV1.tiendaGeorgeV1.entity.Producto;
import com.tiendaV1.tiendaGeorgeV1.entity.Provedor;
import com.tiendaV1.tiendaGeorgeV1.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProductoConverter productoConverter;

    @GetMapping("/producto")
    public List<Producto> getProducto(){
     return productoService.productos();
    }

    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto create(@RequestBody ProductoModel productoModel){
        //Con este modelo si llegara el provedor pero como numero
        Producto producto = productoConverter.ProductoToProductoModel(productoModel);
        return productoService.create(producto);
    }
}
