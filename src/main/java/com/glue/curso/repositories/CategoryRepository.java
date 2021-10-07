package com.glue.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glue.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
