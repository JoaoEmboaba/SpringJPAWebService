package com.embosoft.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.embosoft.course.entities.User;

@RestController // Fala que essa classe é um recurso web que é usado como controlador Rest
@RequestMapping(value = "/users") // Define um caminho para o nosso recurso "com.embosoft.course.entities.User"
public class UserResource {
	
	@GetMapping // Especifica que esse método responde a requisição GET HTTP
	public ResponseEntity<User> findAll(){ // Returna uma resposta web do tipo especificado dentro do generics
		User u = new User(1L, "João", "jemboaba17", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
