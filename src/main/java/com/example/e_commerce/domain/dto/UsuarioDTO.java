package com.example.e_commerce.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    String nome;

    String email;

    String cpf;

    EnderecoDTO endereco;
    
}
