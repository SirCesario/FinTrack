package com.fintrack.ceva.service.imp;

import com.fintrack.ceva.entity.User;
import com.fintrack.ceva.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class AutentiUserImp {

    @Autowired
    private UserRepository userRepository;

    public boolean autenticar (String nombreUsuario, String contraseña) {
        User user = userRepository.findByNombreUsuario(nombreUsuario);
        String contraseñaGuardada = null;
        if (user != null) {
            contraseñaGuardada = user.getContraseña();
        }
        return BCrypt.checkpw(contraseña, contraseñaGuardada);
    }
}
