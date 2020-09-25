package com.example.film.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.film.model.Attore;
import com.example.film.repository.RepAttore;

@Service
public class ServiceAttore {

@Autowired	
RepAttore repAttore;	
	
public List<Object> showSelect() {
	
	return repAttore.showAttori();
}
public void save(Attore attore) {
	repAttore.save(attore);
}
	
}
