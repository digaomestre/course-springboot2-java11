package com.glue.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glue.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
