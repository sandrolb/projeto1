package com.autoestudo.projeto1.entity;

//import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Document
public class User {

	@Id
	private String id;

	private String nome;
	private String email;

	//private Set<Role> roles;
	
	public User() {
	
	}
	
	public User(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
