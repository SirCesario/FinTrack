package com.fintrack.ceva.controller;

import com.fintrack.ceva.service.imp.AutentiUserImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AutoLoginController {

    @Autowired
    private AutentiUserImp autentiUserImp;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        String nombreUsuario = credentials.get("nombreUsuario");
        String contraseña = credentials.get("contrasena");

        if (autentiUserImp.autenticar(nombreUsuario, contraseña)) {
            return ResponseEntity.ok("¡Inicio de sesión exitoso!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nombre de usuario o contraseña incorrectos.");
        }
    }

}
