package com.embosoft.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.embosoft.course.entities.User;
import com.embosoft.course.repositories.UserRepository;


@Service // Define essa classe como um serviço
public class UserService {

	@Autowired // Faz a injeção de dependências 
	private UserRepository Repository;
	
	public List<User> findAll(){
		return Repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = Repository.findById(id);
		return obj.get();
	}
}
 