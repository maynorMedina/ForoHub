package com.aluracursos.Api_ForoHub.repository;

import com.aluracursos.Api_ForoHub.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    UserDetails findByLogin(String username);
}