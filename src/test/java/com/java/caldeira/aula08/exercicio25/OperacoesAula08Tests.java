package com.java.caldeira.aula09.exercicio25;

import aula08.exercicio25.Operacoes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacoesAula08Tests {
    Operacoes operacoes = new Operacoes();

    @Test
    void verificaSomaDeDoisNumeros(){
        Double resutado = operacoes.somaDeDoisNumeros(5.0, 2.0);
        Assertions.assertEquals(7.0, resutado);
    }

    @Test
    void verificaSubtracaoDeDoisNumeros(){
        Double resutado = operacoes.subtracaoDeDoisNumeros(5.0, 2.0);
        Assertions.assertEquals(3.0, resutado);
    }

    @Test
    void verificaMultiplicacaoDeDoisNumeros(){
        Double resutado = operacoes.multiplicacaoDeDoisNumeros(5.0, 2.0);
        Assertions.assertEquals(10.0, resutado);
    }

    @Test
    void verificaDivisaoDeDoisNumeros(){
        Double resutado = operacoes.divisaoDeDoisNumeros(5.0, 2.0);
        Assertions.assertEquals(2.5, resutado);
    }

    @Test
    void verificaDivisaoDeDoisNumerosComSegundoNumeroSendoZero(){
        Double resutado = operacoes.divisaoDeDoisNumeros(5.0, 0.0);
        Assertions.assertEquals(null, resutado);
    }
}
