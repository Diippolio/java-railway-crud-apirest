package com.diippolio.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diippolio.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
