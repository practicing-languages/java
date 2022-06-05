package com.mycompany.rafael.coelho.c1.cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
       
        Integer quantidadeCadeiras = 0,quantidadeDesejada = 0, opcaoSelecionada = 0, capacidadeMaxima = 0, cadeirasRestantes = 0;

        
        System.out.println("Bem-vindo administrador! Primeiro cadastre uma sala do cinema:\n"
                + "\n"
                + "Quantidade de cadeiras da sala:");
        quantidadeCadeiras = leitor.nextInt();

        System.out.println("\nCapacidade Máxima devido a pandemia (%)");
        capacidadeMaxima = (quantidadeCadeiras / 100) * leitor.nextInt();
        cadeirasRestantes = capacidadeMaxima;

        System.out.println(String.format("\n A sala possui %d  ingressos disponíveis!", cadeirasRestantes));
        do {

            System.out.println("\nEscolha os próximos passos:\n"
                    + "1 - Reservar Ingressos\n"
                    + "2 - Sair");
            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    cadeirasRestantes = reservarIngressos(quantidadeDesejada, leitor, capacidadeMaxima, cadeirasRestantes);
                    break;
                case 2:
                    System.out.println("\nAté logo!");
                    break;
                default:
                    System.out.println("\nNúmero Inválido");
                    break;
            }
        } while (opcaoSelecionada != 2);

    }

    public static Integer reservarIngressos(Integer quantidadeDesejada, Scanner leitor, Integer capacidadeMaxima, Integer cadeirasRestantes) {
        do {
            System.out.println("\nDigite a quantidade de cadeiras desejadas:");
            quantidadeDesejada = leitor.nextInt();
            
            if ((quantidadeDesejada > cadeirasRestantes)||(quantidadeDesejada < 0)) {
                System.out.println(String.format("\nInfelizmente não temos a quantidade de cadeiras digitada, "
                        + "quantidade disponível: %d \n"
                        + "Digite uma quantidade válida:", cadeirasRestantes));
                quantidadeDesejada = leitor.nextInt();
            }
        } while (quantidadeDesejada > cadeirasRestantes);

        for (int i = 1; i <= quantidadeDesejada; i++) {
            cadeirasRestantes--;
            System.out.println(String.format("Venda do %dº ingresso registrada, restam %d ingressos.", i, cadeirasRestantes));
        }

        System.out.println(String.format("\nVocê comprou %d ingressos, bom filme!", quantidadeDesejada));

        return cadeirasRestantes;

    }
}
