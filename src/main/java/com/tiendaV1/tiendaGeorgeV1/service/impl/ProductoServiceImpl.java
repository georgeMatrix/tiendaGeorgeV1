package com.tiendaV1.tiendaGeorgeV1.service.impl;

import com.tiendaV1.tiendaGeorgeV1.entity.Producto;
import com.tiendaV1.tiendaGeorgeV1.repository.ProductoRepository;
import com.tiendaV1.tiendaGeorgeV1.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> productos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }
}
