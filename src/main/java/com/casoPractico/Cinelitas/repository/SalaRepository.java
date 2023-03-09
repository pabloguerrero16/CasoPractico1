package com.casoPractico.Cinelitas.repository;

import com.casoPractico.Cinelitas.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo Guerrero
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala, Long> {
    
}
