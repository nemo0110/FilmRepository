package com.example.film.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.film.model.Attore;
import com.example.film.service.ServiceAttore;

//@CrossOrigin("*")
@RestController
@Controller
@WebServlet(name = "Controller01", urlPatterns = {"*.do"})
public class Controller01 {

	
//	
//	void req(HttpServletRequest request, HttpServletResponse response) {
//		StringBuffer str = new StringBuffer(request.getServletPath());
//	    String azione = str.substring(1, str.lastIndexOf(".do"));
//	    String nextPage = "";
//	    azione = "select";
//	  
//	}
//		 
	 
	@Autowired 
	ServiceAttore srvAttore;
	
	@RequestMapping(value = {"/select"})
    public void selectDiProva() {       
		srvAttore.showSelect();
		List<Object> l = srvAttore.showSelect();       
		System.out.println("ciao");
    }
	@RequestMapping(value = {"/save"})
    public void saveAttore() { 
		Attore attore = new Attore(6l, "ciao");
		srvAttore.save(attore);
		
    }
	
	
	
}
