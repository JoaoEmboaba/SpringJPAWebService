package com.embosoft.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.embosoft.course.entities.User;
import com.embosoft.course.services.UserService;

@RestController // Fala que essa classe é um recurso web que é usado como controlador Rest
@RequestMapping(value = "/users") // Define um caminho para o nosso recurso "com.embosoft.course.entities.User"
public class UserResource {

	@Autowired
	private UserService us;

	@GetMapping // Especifica que esse método responde a requisição GET HTTP
	public ResponseEntity<List<User>> findAll() { // Returna uma resposta web do tipo especificado dentro do generics
		List<User> list = us.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}") // Define que esse caminho vai receber um parâmetro
	public ResponseEntity<User> findById(@PathVariable Long id) { // Define que o parâmetro será a variável do caminho
		User user = us.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
