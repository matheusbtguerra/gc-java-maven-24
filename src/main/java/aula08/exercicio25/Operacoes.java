package aula08.exercicio25;

public class Operacoes {
    public Double somaDeDoisNumeros(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double subtracaoDeDoisNumeros(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiplicacaoDeDoisNumeros(Double num1, Double num2) {
        return num1 * num2;
    }

    public Double divisaoDeDoisNumeros(Double num1, Double num2){
        if (num2 == 0) {
            throw new CaldeiraException("Impossível dividir por 0!");
        }
        return num1 / num2;
    }

}
