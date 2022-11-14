package com.alleoni.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alleoni.course.entities.Category;
import com.alleoni.course.entities.Order;
import com.alleoni.course.entities.User;
import com.alleoni.course.entities.enums.OrderStatus;
import com.alleoni.course.repositories.CategoryRepository;
import com.alleoni.course.repositories.OrderRepository;
import com.alleoni.course.repositories.UserRepository;

@Configuration // @Configuration para informar que é apenas arquivo de configuração.
@Profile("test") // O nome "test" deve ser o mesmo que foi mencionado na application.properties
public class TesteConfig implements CommandLineRunner { // CommandoLineRuuner serve para executar quando o programa for
														// iniciado

	@Autowired // Serve para associar uma instância de user repository
	private UserRepository userRepository; // Objeto repository que acessa os dados

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception { // Métodos implementado class TesteConfig

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_MOMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_MOMENT, u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}

}
