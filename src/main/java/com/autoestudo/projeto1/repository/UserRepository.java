package com.autoestudo.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoestudo.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
