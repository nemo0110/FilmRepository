package com.example.film.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attore {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;     
	
	private String nomeCognome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCognome() {
		return nomeCognome;
	}

	public void setNomeCognome(String nomeCognome) {
		this.nomeCognome = nomeCognome;
	}

	public Attore(Long id, String nomeCognome) {
		this.id = id;
		this.nomeCognome = nomeCognome;
	}

	public Attore() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
}
