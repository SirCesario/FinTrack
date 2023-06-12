package com.fintrack.ceva.service.imp;

import com.fintrack.ceva.DTO.UsuarioDTO;
import com.fintrack.ceva.entity.Usuario;
import com.fintrack.ceva.repository.UsuarioRepository;
import com.fintrack.ceva.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private UsuarioServiceImp(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario registrarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombres(usuarioDTO.getNombres());
        usuario.setApellidos(usuarioDTO.getApellidos());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setCelular(usuarioDTO.getCelular());
        usuario.setSexo(usuarioDTO.getSexo());
        usuario.setIngresos(usuarioDTO.getIngresos());
        return usuarioRepository.save(usuario);
    }

    @Override
    public UsuarioDTO obtenerUsuarioPorId(Long id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            return convertirAUsuarioDTO(usuario);
        } else {
            return null;
        }
    }

    private UsuarioDTO convertirAUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setNombres(usuario.getNombres());
        usuarioDTO.setApellidos(usuario.getApellidos());
        usuarioDTO.setCorreo(usuario.getCorreo());
        usuarioDTO.setCelular(usuario.getCelular());
        usuarioDTO.setSexo(usuario.getSexo());
        usuarioDTO.setIngresos(usuario.getIngresos());
        return usuarioDTO;
    }
}
