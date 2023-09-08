package com.itsqmet.Taller1.repositorios;

import com.itsqmet.Taller1.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
//Usuario findByUsername(String usuarioCorreo );
}
