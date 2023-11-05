package com.fintrack.ceva.controller;

import com.fintrack.ceva.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
@CrossOrigin("*")
public class LoginUser {

    private LoginService loginService;

    @GetMapping("/user")
    public ResponseEntity<Void> traerUsuario(@PathVariable String nombreUsuario, String password){
        String mensaje = "";
        loginService.traerUsuario(nombreUsuario, password);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
