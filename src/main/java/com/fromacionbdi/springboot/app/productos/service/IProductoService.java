package com.fromacionbdi.springboot.app.productos.service;

import com.fromacionbdi.springboot.app.productos.model.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
}
