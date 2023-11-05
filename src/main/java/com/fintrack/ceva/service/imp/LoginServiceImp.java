package com.fintrack.ceva.service.imp;

import com.fintrack.ceva.controller.LoginUser;
import com.fintrack.ceva.repository.LoginUsuarioRepository;
import com.fintrack.ceva.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private LoginUsuarioRepository loginUsuarioRepository;

    private LoginServiceImp(LoginUsuarioRepository loginUsuarioRepository){
        this.loginUsuarioRepository = loginUsuarioRepository;
    }


    @Override
    public LoginUser traerUsuario(String nombreUsuario, String password) {
        return null;
    }

}
