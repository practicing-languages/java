package br.com.bandtec.exercicio03;

public class Calculadora {

    public void soma(Integer numero1, Integer numero2) {
        System.out.println(String.format("%d + %d = %d", numero1, numero2, (numero1 + numero2)));
    }

    public void subtracao(Integer numero1, Integer numero2) {
        System.out.println(String.format("%d - %d = %d", numero1, numero2, (numero1 - numero2)));
    }

    public void multiplicacao(Integer numero1, Integer numero2) {
        System.out.println(String.format("%d * %d = %d", numero1, numero2, (numero1 * numero2)));
    }

    public void divisao(Integer numero1, Integer numero2) {
        System.out.println(String.format("%d / %d = %d", numero1, numero2, (numero1 / numero2)));
    }
}