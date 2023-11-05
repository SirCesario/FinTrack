package com.fintrack.ceva.service;

import com.fintrack.ceva.controller.LoginUser;

public interface LoginService {

    LoginUser traerUsuario (String nombreUsuario, String password);
}
