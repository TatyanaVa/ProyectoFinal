/*package com.itsqmet.Taller1.seguridad;

import com.itsqmet.Taller1.entidades.Usuario;
import com.itsqmet.Taller1.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //consulta tabla de usuarios
        Usuario usuario=usuarioRepository.findByUsername(username);

        //crear lista de autentif de roles
        List<GrantedAuthority> roles =new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ADMIN"));
        UserDetails userDetails=new User(usuario.getUsuarioCorreo(),usuario.getContra(),roles);


        return userDetails;
    }
}
*/