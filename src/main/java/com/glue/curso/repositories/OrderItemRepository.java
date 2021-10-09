package com.glue.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glue.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
