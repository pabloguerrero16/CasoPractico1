package com.casoPractico.Cinelitas.service;

import com.casoPractico.Cinelitas.entity.Sala;
import com.casoPractico.Cinelitas.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo Guerrero
 */
@Service
public class SalaService implements ISalaService{
    
    @Autowired
    private SalaRepository salaRepository;
    
    @Override
    public List<Sala> listSalas() {
        return (List<Sala>)salaRepository.findAll();
    }
    
}
