package com.alleoni.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alleoni.course.entities.Order;
import com.alleoni.course.repositories.OrderRepository;

//@Component Registra pra você sua classe como componente do Spring e vai poder ser injetado assim automaticamente com o AutoWired
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){		/*Método para retornar todos usuários do banco de dados*/
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get(); // Vai retornar o objeto do tipo <Order> que estiver dentro do Optional<Order>
	}
	
}
