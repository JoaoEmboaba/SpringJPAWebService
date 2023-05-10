package com.embosoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.embosoft.course.entities.User;

// Implementação padrão dessa interface
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
