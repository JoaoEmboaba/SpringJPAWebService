package com.embosoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.embosoft.course.entities.User;

// Implementação padrão dessa interface
 // Define essa classe/interface como um repositório
public interface UserRepository extends JpaRepository<User, Long>{ // JPARepository é usado para manusear os dados 
	
	
	
}	
