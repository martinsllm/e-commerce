package com.example.e_commerce.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompraDTO {

    private String produto;

    private Long valor;

    private CartaoDTO cartao;
    
}
