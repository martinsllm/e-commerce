package com.example.e_commerce.infraestructure.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.e_commerce.domain.dto.CartaoDTO;
import com.example.e_commerce.domain.dto.UsuarioDTO;

@FeignClient(value = "api-users", url = "localhost:8081")
public interface UsuarioClient {

    @PostMapping("/usuario")
    UsuarioDTO registraUsuario(@RequestBody UsuarioDTO usuario);

    @PostMapping("/cartao")
    CartaoDTO registraCartao(@RequestBody CartaoDTO cartao);

    @PostMapping("/cartao/validar")
    Boolean validarPagamento(@RequestBody CartaoDTO cartao);
    
} 
