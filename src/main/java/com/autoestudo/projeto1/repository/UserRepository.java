package com.autoestudo.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.autoestudo.projeto1.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByNome(String nome);
	
	@Query("{ 'email' : ?0 }")
	User findByEmailQQ(String email);
	
	User findByNomeIgnoreCaseLike(String nome);

}
