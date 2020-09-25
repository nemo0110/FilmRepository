package com.example.film.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produttore {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;     
	
	private String cognome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Produttore(Long id, String cognome) {
		super();
		this.id = id;
		this.cognome = cognome;
	}
	
}
