package com.itsqmet.Taller1.controladores;

import com.itsqmet.Taller1.entidades.Usuario;
import com.itsqmet.Taller1.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    //leer
    @GetMapping("/usuarios")
    public String listar (Model model){
        List<Usuario> usuarios =usuarioRepository.findAll();
        model.addAttribute("usuarios",usuarios);
        return "usuario/tablaUsuario";
    }

    //crear
    @GetMapping("/usuario/formularioUsuario")
    public String formulario (Model model){
        model.addAttribute("usuario",new Usuario());
        //List<Usuario> usuarios=usuarioRepository.findAll();
      //  model.addAttribute("usuarios",usuarios);
        return "usuario/formularioUsuario";
    }
    @PostMapping("/usuario/formularioUsuario")
    public String crear(Usuario usuario){
        usuarioRepository.save(usuario);
        return "redirect:/usuarios";
    }

    //actualizar
    @GetMapping("/editarU/{id}")
    public String actualizar(@PathVariable int id, Model model){
        Optional<Usuario>usuario=usuarioRepository.findById(id);
        model.addAttribute("usuario", usuario);
        return "usuario/formularioUsuario";
    }

    //eliminar
    @GetMapping("/eliminarU/{id}")
    public String eliminar(@PathVariable int id){
        usuarioRepository.deleteById(id);
        return "redirect:/usuarios";
    }



}
