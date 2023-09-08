package com.itsqmet.Taller1.entidades;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.boot.archive.scan.internal.ScanResultImpl;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private String usuarioCorreo;
    private String rol;
    private String contra;
}
