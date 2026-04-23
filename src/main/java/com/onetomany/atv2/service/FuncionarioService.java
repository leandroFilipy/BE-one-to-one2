package com.onetomany.atv2.service;

import org.springframework.stereotype.Service;

import com.onetomany.atv2.dto.FuncionarioRequest;
import com.onetomany.atv2.dto.FuncionarioResponse;
import com.onetomany.atv2.mapper.FuncionarioMapper;
import com.onetomany.atv2.model.Funcionario;
import com.onetomany.atv2.repository.FuncionarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    

    private final FuncionarioMapper funcionarioMapper;
    private final FuncionarioRepository funcionarioRepository;

    
    public FuncionarioResponse create(FuncionarioRequest funcionarioRequest){
        return funcionarioMapper.toResponse(funcionarioRepository.save(funcionarioMapper.toEntity(funcionarioRequest)));
    }

    public FuncionarioResponse findById(long id){
        Funcionario funcionario = funcionarioRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
        FuncionarioResponse funcionarioResponse = funcionarioMapper.toResponse(funcionario);

        return funcionarioResponse;
    }
    

}
