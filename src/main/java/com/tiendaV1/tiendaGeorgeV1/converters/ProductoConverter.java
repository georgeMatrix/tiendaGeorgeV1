package com.tiendaV1.tiendaGeorgeV1.converters;

import com.tiendaV1.tiendaGeorgeV1.Models.ProductoModel;
import com.tiendaV1.tiendaGeorgeV1.entity.Producto;
import com.tiendaV1.tiendaGeorgeV1.entity.Provedor;
import org.springframework.stereotype.Component;

@Component
public class ProductoConverter {
    public Producto ProductoToProductoModel(ProductoModel productoModel){
        Producto producto = new Producto();
        Provedor provedor =  new Provedor();
        producto.setNombre(productoModel.getNombre());
        producto.setDescripcion(productoModel.getDescripcion());
        provedor.setIdProvedor(productoModel.getIdprovedor());
        producto.setProvedor(provedor);
        return producto;
    }
}
