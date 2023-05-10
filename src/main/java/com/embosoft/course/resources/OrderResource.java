package com.embosoft.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.embosoft.course.entities.Order;
import com.embosoft.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService os;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> pedidos = os.findAll();
		return ResponseEntity.ok().body(pedidos);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = os.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
