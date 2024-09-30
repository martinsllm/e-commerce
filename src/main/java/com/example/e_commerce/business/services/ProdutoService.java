package com.example.e_commerce.business.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.e_commerce.domain.dto.ProdutoDTO;
import com.example.e_commerce.infraestructure.clients.ProdutoClient;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoClient produtoClient;

    public List<ProdutoDTO> buscaTodosProdutos() { 
        return produtoClient.buscaTodosProdutos(); 
    }

    public ProdutoDTO buscaProdutoPorNome(String nome) {
        return produtoClient.buscaProdutoPorNome(nome);
    }
    
}
