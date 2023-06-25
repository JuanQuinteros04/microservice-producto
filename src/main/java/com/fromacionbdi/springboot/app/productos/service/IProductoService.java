package com.fromacionbdi.springboot.app.productos.service;

import com.formacionbdi.springboot.app.commons.model.entity.Producto;

import java.util.List;

public interface IProductoService{
    public List<Producto> findAll();
    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void deleteProducto(Long id);
}
