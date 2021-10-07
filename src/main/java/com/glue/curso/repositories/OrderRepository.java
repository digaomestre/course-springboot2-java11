package com.glue.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glue.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
