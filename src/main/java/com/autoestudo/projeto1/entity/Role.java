package com.autoestudo.projeto1.entity;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Role {
	
	@Id
	private String id;
	private String nome;
	
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
	
	

}
