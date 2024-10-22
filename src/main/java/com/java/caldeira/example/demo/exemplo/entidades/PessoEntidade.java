package com.java.caldeira.example.demo.exemplo.entidades;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")

public class PessoEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pessoaID;

    private String name;

    @Column(name = "pessoa_name")
    private String pessoaName;
}
