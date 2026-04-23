package com.onetomany.atv2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.atv2.dto.FuncionarioRequest;
import com.onetomany.atv2.dto.FuncionarioResponse;
import com.onetomany.atv2.service.FuncionarioService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/funcionarios")
@RestController
@RequiredArgsConstructor
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<FuncionarioResponse> create(@RequestBody FuncionarioRequest funcionarioRequest) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(funcionarioService.create(funcionarioRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioResponse> findById(@PathVariable long id){
        return ResponseEntity.status(200).body(funcionarioService.findById(id));
    }

}
