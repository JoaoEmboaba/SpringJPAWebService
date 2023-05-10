package com.embosoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.embosoft.course.entities.User;

// Implementação padrão dessa interface
@Repository // Define essa classe/interface como um repositório
public interface UserRepository extends JpaRepository<User, Long>{ // JPARepository é usado para manusear os dados 
	
	
	
}
