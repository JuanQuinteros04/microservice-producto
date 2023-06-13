package com.fromacionbdi.springboot.app.productos.controller;

import com.fromacionbdi.springboot.app.productos.model.entity.Producto;
import com.fromacionbdi.springboot.app.productos.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class ProductoController {
    @Autowired
    ProductoServiceImpl productoServiceImpl;

    @GetMapping("/listar")
    public List<Producto> listar(){
        return productoServiceImpl.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id) throws InterruptedException {
        if(id.equals(10)){
            throw new IllegalStateException("Producto no encontrado!");
        }

        if(id.equals(7L)){
            TimeUnit.SECONDS.sleep(5L);
        }
        return productoServiceImpl.findById(id);
    }
}
