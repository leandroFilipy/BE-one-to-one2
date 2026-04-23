package com.onetomany.atv2.dto;

import com.onetomany.atv2.model.Endereco;

public record FuncionarioResponse(
    long id,
    String nome,
    Endereco endereco
) {
    
}
