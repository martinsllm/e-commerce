package com.example.e_commerce.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProdutoDTO {

    private String nome;

    private String descricao;

    private Long preco;
    
}
