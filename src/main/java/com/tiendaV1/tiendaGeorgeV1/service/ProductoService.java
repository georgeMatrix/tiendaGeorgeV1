package com.tiendaV1.tiendaGeorgeV1.service;

import com.tiendaV1.tiendaGeorgeV1.entity.Producto;
import com.tiendaV1.tiendaGeorgeV1.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> productos();
    Producto create(Producto producto);
}
