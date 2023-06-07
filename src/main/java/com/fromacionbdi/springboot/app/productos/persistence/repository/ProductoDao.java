package com.fromacionbdi.springboot.app.productos.persistence.repository;

import com.fromacionbdi.springboot.app.productos.model.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Long> {
}
