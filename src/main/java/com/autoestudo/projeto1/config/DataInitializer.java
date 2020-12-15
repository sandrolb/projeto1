package com.autoestudo.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.autoestudo.projeto1.entity.User;
import com.autoestudo.projeto1.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<User> users = userRepository.findAll(); 
		
		if (users.isEmpty()) {
			User user = new User();
			
			user.setEmail("dellvostro@projeto1.com.br");
			user.setNome("Dell Vostro");
			
			userRepository.save(user);
		}
	}

}
