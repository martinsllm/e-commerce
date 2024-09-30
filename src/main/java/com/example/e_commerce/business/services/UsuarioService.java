package com.example.e_commerce.business.services;

import org.springframework.stereotype.Service;

import com.example.e_commerce.domain.dto.UsuarioDTO;
import com.example.e_commerce.infraestructure.clients.UsuarioClient;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient usuarioClient;

    public UsuarioDTO registraUsuario(UsuarioDTO usuario) {
        return usuarioClient.registraUsuario(usuario);
    }
    
}
