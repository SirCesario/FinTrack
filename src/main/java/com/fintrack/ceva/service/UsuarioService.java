package com.fintrack.ceva.service;

import com.fintrack.ceva.DTO.UsuarioDTO;
import com.fintrack.ceva.entity.Usuario;

public interface UsuarioService {

    Usuario registrarUsuario(UsuarioDTO usuarioDTO);

    UsuarioDTO obtenerUsuarioPorId(Long id);
}
