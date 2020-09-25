package com.example.film.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.film.model.Attore;
import com.example.film.service.ServiceAttore;


@CrossOrigin("*")
@RestController
public class Controller {

	@Autowired 
	ServiceAttore srvAttore;
	
	@RequestMapping(value = {"/select"})
    public List<Object> selectDiProva() {       
		srvAttore.showSelect();
		List<Object> l = srvAttore.showSelect();
        return l;
    }
	@RequestMapping(value = {"/save"})
    public void saveAttore() { 
		Attore attore = new Attore(6l, "ciao");
		srvAttore.save(attore);
		
    }
	
	
	
}
