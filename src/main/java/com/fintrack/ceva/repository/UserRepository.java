package com.fintrack.ceva.repository;

import com.fintrack.ceva.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {

    User findByNombreUsuario(String nombreUsuario);
}
