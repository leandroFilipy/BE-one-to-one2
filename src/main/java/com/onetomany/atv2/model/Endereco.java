package com.onetomany.atv2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Endereco {
    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private long id;
    private String rua;
    private int numero;
    
    @JsonIgnore
    @OneToOne(cascade=CascadeType.ALL)
    private Funcionario funcionario;

    public Endereco(int numero, String rua) {
        this.numero = numero;
        this.rua = rua;
    }



}
