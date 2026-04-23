package com.onetomany.atv2.mapper;

import org.springframework.stereotype.Component;

import com.onetomany.atv2.dto.FuncionarioRequest;
import com.onetomany.atv2.dto.FuncionarioResponse;
import com.onetomany.atv2.model.Endereco;
import com.onetomany.atv2.model.Funcionario;

@Component
public class FuncionarioMapper {
    
    public Funcionario toEntity(FuncionarioRequest funcionarioRequest){
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(funcionarioRequest.nome());

        Endereco endereco = funcionarioRequest.endereco();
        
        if(endereco != null){
            endereco.setNumero(funcionarioRequest.endereco().getNumero());
            endereco.setRua(funcionarioRequest.endereco().getRua());

            endereco.setFuncionario(funcionario);
            funcionario.setEndereco(endereco);
        }

        return funcionario;
    }

    public FuncionarioResponse toResponse(Funcionario funcionario){
        return new FuncionarioResponse(
            funcionario.getId(),
            funcionario.getNome(),
            funcionario.getEndereco()
        );
    }
}
