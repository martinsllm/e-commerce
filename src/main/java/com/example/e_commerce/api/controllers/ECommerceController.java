package com.example.e_commerce.api.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.e_commerce.business.services.ProdutoService;
import com.example.e_commerce.business.services.UsuarioService;
import com.example.e_commerce.domain.dto.ProdutoDTO;
import com.example.e_commerce.domain.dto.UsuarioDTO;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/e-commerce")
@RequiredArgsConstructor
public class ECommerceController {

    private final ProdutoService produtoService;
    private final UsuarioService usuarioService;

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutoDTO>> buscaTodosProdutos() {
        return ResponseEntity.ok(produtoService.buscaTodosProdutos());
    }

    @GetMapping("/produtos/nome")
    public ResponseEntity<ProdutoDTO> buscaProdutosPorNome(@RequestParam(value = "nome") String nome) {
        return ResponseEntity.ok(produtoService.buscaProdutoPorNome(nome));
    }

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioDTO> registraUsuario(@RequestBody UsuarioDTO usuario) {
        return ResponseEntity.ok(usuarioService.registraUsuario(usuario));
    }
    
}
