package com.embosoft.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.embosoft.course.entities.Category;
import com.embosoft.course.entities.Order;
import com.embosoft.course.entities.User;
import com.embosoft.course.entities.enums.OrderStatus;
import com.embosoft.course.repositories.CategoryRepository;
import com.embosoft.course.repositories.OrderRepository;
import com.embosoft.course.repositories.UserRepository;

@Configuration // Específica que essa classe é uma classe de configuração
@Profile("test") // Identifica o usuário que vai receber determinada configuração
public class TestConfig implements CommandLineRunner { // Interface CommandLineRunner serve para colocar pontos de
														// execução na nossa aplicação

	@Autowired // Automatiza a injeção de dependência
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {

		Category c1 = new Category(null, "Eletrônicos");
		Category c2 = new Category(null, "Periféricos");
		categoryRepository.saveAll(Arrays.asList(c1, c2));

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u2);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}
}
