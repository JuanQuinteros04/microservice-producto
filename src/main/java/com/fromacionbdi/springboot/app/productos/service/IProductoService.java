package com.fromacionbdi.springboot.app.productos.service;

import com.fromacionbdi.springboot.app.productos.model.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductoService{
    public List<Producto> findAll();
    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void deleteProducto(Long id);
}
