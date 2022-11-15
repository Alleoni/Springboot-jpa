package com.alleoni.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alleoni.course.entities.Product;
import com.alleoni.course.repositories.ProductRepository;

//@Component Registra pra você sua classe como componente do Spring e vai poder ser injetado assim automaticamente com o AutoWired
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){		/*Método para retornar todos usuários do banco de dados*/
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get(); // Vai retornar o objeto do tipo <Product> que estiver dentro do Optional<Product>
	}
	
}
