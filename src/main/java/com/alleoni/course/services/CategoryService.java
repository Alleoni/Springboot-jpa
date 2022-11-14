package com.alleoni.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alleoni.course.entities.Category;
import com.alleoni.course.repositories.CategoryRepository;

//@Component Registra pra você sua classe como componente do Spring e vai poder ser injetado assim automaticamente com o AutoWired
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){		/*Método para retornar todos usuários do banco de dados*/
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get(); // Vai retornar o objeto do tipo <Category> que estiver dentro do Optional<Category>
	}
	
}
