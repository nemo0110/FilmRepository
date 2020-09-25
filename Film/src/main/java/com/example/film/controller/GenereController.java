package com.example.film.controller;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.film.model.Genere;
import com.example.film.repository.RepGenere;

@CrossOrigin("*")
@RestController
public class GenereController {

@Autowired
RepGenere repG;

@RequestMapping(value= {"/sel"})
public List<Genere> findGeneri() {
	List<Genere> listaGeneri = repG.findGen();
	System.out.println(listaGeneri);
	return listaGeneri;
}
@RequestMapping(value= {"/join"})
public List<Object> findJoins(){
	List<Object> listaJoin = repG.findJoin();
	return listaJoin;
}

}
