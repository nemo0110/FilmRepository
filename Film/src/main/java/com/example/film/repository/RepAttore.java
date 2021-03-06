package com.example.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.film.model.Attore;

import java.util.List;


@Repository
public interface RepAttore extends JpaRepository<Attore, Long> {

//	@Query("SELECT NomeCognome FROM Attore")
//	List<Attore> showAttori();
	@Query(value = "SELECT Attore.id, nomeCognome, Genere.descrizione FROM Attore JOIN Genere ON Genere.id = 2 ", nativeQuery = true)
	List<Object> showAttori();
}
