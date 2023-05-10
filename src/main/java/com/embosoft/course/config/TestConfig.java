package com.embosoft.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.embosoft.course.entities.User;
import com.embosoft.course.repositories.UserRepository;

@Configuration // Específica que essa classe é uma classe de configuração
@Profile("test") // Identifica o usuário que vai receber determinada configuração
public class TestConfig implements CommandLineRunner { // Interface CommandLineRunner serve para colocar pontos de
														// execução na nossa aplicação

	@Autowired // Automatiza a injeção de dependência
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}
}
