package com.java.caldeira.example.demo.exemplo.repositorios;

import com.java.caldeira.example.demo.exemplo.entidades.PessoEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PessoaRepositorio extends JpaRepository<PessoEntidade, Integer> {
    void findPessoaByName();
}
