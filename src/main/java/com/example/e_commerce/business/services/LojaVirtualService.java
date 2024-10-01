package com.example.e_commerce.business.services;

import org.springframework.stereotype.Service;
import com.example.e_commerce.domain.dto.CompraDTO;
import com.example.e_commerce.domain.dto.ProdutoDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LojaVirtualService {

    private final ProdutoService produtoService;
    private final UsuarioService usuarioService;

    public String realizarCompra(CompraDTO compra) {
        buscaProdutoPorNome(compra.getProduto());
        Boolean confirmaPagamento = verificaPagamento(compra);
        return confirmaPagamento ? "Pagamento aprovado!" : "Pagamento negado!";
    }

    public ProdutoDTO buscaProdutoPorNome(String nome) {
        return produtoService.buscaProdutoPorNome(nome);
    }

    public Boolean verificaPagamento(CompraDTO compra) {
        return usuarioService.validaPagamento(compra.getCartao());
    }
    
}
