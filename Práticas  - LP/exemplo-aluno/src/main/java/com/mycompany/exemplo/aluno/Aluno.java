/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.aluno;

/**
 *
 * @author Dell
 */
public class Aluno {

    String ra;
    String nome;
    Double nota1;
    Double nota2;
    Integer qtdFalta;
    Double media;

    public void vizulizarNotas() {
        System.out.println(String.format("Seu RA: %s "
                + "\nSeu Nome: %s"
                + "\nNota 1: %.2f"
                + "\nNota 2: %.2f"
                + "\nMédia Final: %.2f", ra, nome, nota1, nota2,media));
    }

    public void vizualizarFaltas() {
        System.out.println(String.format("Seu RA: %s "
                + "\nSeu Nome: %s"
                + "\nQuantidade de faltas: %d", ra, nome, qtdFalta));
    }

}
