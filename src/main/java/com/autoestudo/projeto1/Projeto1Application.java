package com.autoestudo.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//import com.autoestudo.projeto1.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories(considerNestedRepositories=true)
public class Projeto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Application.class, args);
	}

}
