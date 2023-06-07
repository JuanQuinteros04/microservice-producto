package com.fromacionbdi.springboot.app.productos.service;

import com.fromacionbdi.springboot.app.productos.model.entity.Producto;
import com.fromacionbdi.springboot.app.productos.persistence.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    @Transactional
    public List<Producto> findAll() {
        return (List<Producto>)productoRepository.findAll();
    }

    @Override
    @Transactional
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}
