package com.java.caldeira.example.demo.exemplo;

import com.java.caldeira.example.demo.exemplo.repositorios.PessoaRepositorio;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

public class Exemplo {
    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    private void teste() {
        pessoaRepositorio.findPessoaByName();
    }
}
