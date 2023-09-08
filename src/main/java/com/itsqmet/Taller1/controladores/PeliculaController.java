package com.itsqmet.Taller1.controladores;

import com.itsqmet.Taller1.entidades.Pelicula;
import com.itsqmet.Taller1.repositorios.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class PeliculaController {
    @Autowired
    PeliculaRepository peliculaRepository;

    //leer
    @GetMapping("/peliculas")
    public String listar ( Model model){
        List<Pelicula> peliculas =peliculaRepository.findAll();
        model.addAttribute("peliculas",peliculas);
        return "pelicula/tablaPelicula";
    }

    //crear
    @GetMapping("/pelicula/formularioPelicula")
    public String formulario ( Model model){
        model.addAttribute("pelicula",new Pelicula());
       // List<Pelicula>peliculasReg=peliculaRepository.findAll();
       // model.addAttribute("peliculasReg",peliculasReg);
        return "pelicula/formularioPelicula";
    }
    @PostMapping("/pelicula/formularioPelicula")
    public String crear(Pelicula pelicula){
        peliculaRepository.save(pelicula);
        return "redirect:/peliculas";
    }

    //actualizar
    @GetMapping("/editarP/{id}")
    public String actualizar(@PathVariable int id, Model model){
        Optional<Pelicula> pelicula=peliculaRepository.findById(id);
        model.addAttribute("pelicula", pelicula);
        return "pelicula/formularioPelicula";
    }

    //eliminar
   @GetMapping("/eliminarP/{id}")
    public String eliminar(@PathVariable int id){
        peliculaRepository.deleteById(id);
        return "redirect:/peliculas";
    }

}
