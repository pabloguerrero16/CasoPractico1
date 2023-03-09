package com.casoPractico.Cinelitas.controller;

import com.casoPractico.Cinelitas.entity.Pelicula;
import com.casoPractico.Cinelitas.entity.Sala;
import com.casoPractico.Cinelitas.service.IPeliculaService;
import com.casoPractico.Cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Pablo Guerrero
 */
@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/pelicula")
    public String index (Model model){
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Peliculas en cartelera");
        model.addAttribute("peliculas",listaPelicula);
        return "peliculas";
    }
    
    @GetMapping("/peliculaN")
    public String crearPelicula (Model model){
        List<Sala> listaSalas=salaService.listSalas();
        model.addAttribute("pelicula",new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    
    @GetMapping ("/delete{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula){
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }
    
    @PostMapping("save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }
    
}
