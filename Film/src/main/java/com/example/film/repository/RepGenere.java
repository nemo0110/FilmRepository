package com.example.film.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.film.model.Genere;


@Repository
public interface RepGenere extends JpaRepository<Genere,Long> {
	
	@Query(value="SELECT g.descrizione FROM Genere as g", nativeQuery = true)
	List<Genere> findGen();
	@Query(value="SELECT g.descrizione,a.nomeCognome FROM Genere as g INNER JOIN Attore as a on a.id=1")
	List<Object> findJoin();
}
