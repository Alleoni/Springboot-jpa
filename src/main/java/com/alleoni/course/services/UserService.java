package com.alleoni.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alleoni.course.entities.User;
import com.alleoni.course.repositories.UserRepository;

//@Component Registra pra você sua classe como componente do Spring e vai poder ser injetado assim automaticamente com o AutoWired
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){		/*Método para retornar todos usuários do banco de dados*/
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); // Vai retornar o objeto do tipo <User> que estiver dentro do Optional<User>
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
}
