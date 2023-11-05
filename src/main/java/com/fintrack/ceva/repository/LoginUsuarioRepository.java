package com.fintrack.ceva.repository;

import com.fintrack.ceva.controller.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUsuarioRepository extends JpaRepository {

    LoginUser traerUsuario(String nombreUsuario, String password);

}
