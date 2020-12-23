package com.autoestudo.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.autoestudo.projeto1.entity.User;
import com.autoestudo.projeto1.repository.UserRepository;
//import com.sun.el.stream.Optional;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<User> users = userRepository.findAll(); 
		
		if (users.isEmpty()) {
			createUser("John Doe", "johndoe@amazon.com");
			createUser("Terry Bogard", "terry.bogard@snk.com");
			createUser("Diana Prince", "dianap@dcu.com");
		}
		
		//User user = userRepository.findByNome("Terry Bogard");
		
		//User user = userRepository.findByNomeIgnoreCaseLike("terr");
		User user = userRepository.findByEmailQQ("dianap@dcu.com");
		//User user = userRepository.findByTexto("Ter");
		System.out.println(user.getEmail());
		
//		java.util.Optional<User> user = userRepository.findById(2L);
//		user.get().setNome("John Jones");
//		user.get().setEmail("johnjones@nasdaq.com");
//		userRepository.save(user.get());
	
	}
	
	public void createUser(String nome, String email) {
		
		User user = new User(nome, email);
		userRepository.save(user);
		
	}

}
