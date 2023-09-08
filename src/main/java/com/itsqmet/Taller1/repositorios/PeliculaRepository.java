package com.itsqmet.Taller1.repositorios;

import com.itsqmet.Taller1.entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula,Integer> {
}
