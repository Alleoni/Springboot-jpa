package com.alleoni.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alleoni.course.entities.User;
import com.alleoni.course.repositories.UserRepository;

@Configuration // @Configuration para informar que é apenas arquivo de configuração.
@Profile("test") //O nome "test" deve ser o mesmo que foi mencionado na application.properties
public class TesteConfig implements CommandLineRunner { //CommandoLineRuuner serve para executar quando o programa for iniciado
	
	@Autowired // Serve para associar uma instância de user repository
	private UserRepository userRepository; // Objeto repository que acessa os dados

	@Override
	public void run(String... args) throws Exception { // Métodos implementado class TesteConfig
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
