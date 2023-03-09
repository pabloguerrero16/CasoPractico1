package com.casoPractico.Cinelitas.repository;

import com.casoPractico.Cinelitas.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Pablo Guerrero
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long>{
    
}
