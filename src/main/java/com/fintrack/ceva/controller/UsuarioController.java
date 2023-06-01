package com.fintrack.ceva.controller;

import com.fintrack.ceva.DTO.UsuarioDTO;
import com.fintrack.ceva.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Void> crearUsuario(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.registrarUsuario(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> obtenerUsuarioPorId(@PathVariable Long id){
        UsuarioDTO usuarioDTO = usuarioService.obtenerUsuarioPorId(id);
        if (usuarioDTO != null){
            return ResponseEntity.ok(usuarioDTO);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
