package com.onetomany.atv2.dto;

import com.onetomany.atv2.model.Endereco;

public record FuncionarioRequest (
    String nome,
    Endereco endereco
) {
    
}
