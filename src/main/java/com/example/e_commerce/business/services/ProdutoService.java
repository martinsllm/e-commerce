package com.example.e_commerce.business.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.e_commerce.domain.dto.ProdutoDTO;
import com.example.e_commerce.infraestructure.clients.ProdutoClient;
import com.example.e_commerce.infraestructure.exceptions.BusinessException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoClient produtoClient;

    public List<ProdutoDTO> buscaTodosProdutos() {
        try {
            return produtoClient.buscaTodosProdutos();
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
        
    }

    public ProdutoDTO buscaProdutoPorNome(String nome) {
        try {
            return produtoClient.buscaProdutoPorNome(nome);
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }
    
}
