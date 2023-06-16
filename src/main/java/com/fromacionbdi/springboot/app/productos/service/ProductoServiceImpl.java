package com.fromacionbdi.springboot.app.productos.service;

import com.fromacionbdi.springboot.app.productos.exceptions.NotFoundException;
import com.fromacionbdi.springboot.app.productos.model.entity.Producto;
import com.fromacionbdi.springboot.app.productos.persistence.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>)productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }


    @Override
    public void deleteProducto(Long id) {
        Producto producto = productoRepository.findById(id).orElseThrow(NotFoundException::new);
        productoRepository.delete(producto);
    }
}
