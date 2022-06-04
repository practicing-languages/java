package br.com.bandtec.exercicio03;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.divisao(10, 2);
        calculadora.soma(3, 4);
        calculadora.subtracao(9, 3);
        calculadora.multiplicacao(2, 4);
    }
}