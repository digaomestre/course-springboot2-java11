package com.glue.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glue.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
