package com.example.film.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Genere {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;     
	private String descrizione;
	
	public Genere(Long id) {
		this.id = id;
	}
	public Genere(String descrizione) {
		this.descrizione = descrizione;
	}
	public Genere(Long id, String descrizione) {
		super();
		this.id = id;
		this.descrizione = descrizione;
	}
	public Genere() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
