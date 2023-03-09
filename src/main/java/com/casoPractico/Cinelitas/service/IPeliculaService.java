package com.casoPractico.Cinelitas.service;

import com.casoPractico.Cinelitas.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Pablo Guerrero
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById(long id);
    public void savePelicula(Pelicula pelicula);
    public void delete(long id);
}
