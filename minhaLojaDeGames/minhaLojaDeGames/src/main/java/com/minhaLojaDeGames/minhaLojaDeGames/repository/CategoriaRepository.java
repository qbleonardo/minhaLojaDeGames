package com.minhaLojaDeGames.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.minhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
<<<<<<< HEAD
	public List<Categoria> findAllByGeneroContainingIgnoreCase(String genero);

	
}
=======
	public List<Categoria> findAllGeneroContainingIgnoreCase(String categoria);
}
>>>>>>> Repository
