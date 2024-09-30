package com.example.e_commerce.infraestructure.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.e_commerce.domain.dto.ProdutoDTO;

@FeignClient(value = "api-products", url = "localhost:8080")
public interface ProdutoClient {

    @GetMapping("/produto")
    List<ProdutoDTO> buscaTodosProdutos();

    @GetMapping("/produto/nome")
    ProdutoDTO buscaProdutoPorNome(@RequestParam(value = "nome") String nome);
    
}
