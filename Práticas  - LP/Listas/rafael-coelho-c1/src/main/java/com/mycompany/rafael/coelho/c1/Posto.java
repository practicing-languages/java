package com.mycompany.rafael.coelho.c1;

import java.util.Scanner;

public class Posto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer selecaoPassos = 0, solicitado = 0;
        Double valorGasolina = 0.0, metaFaturamento = 0.0, imposto = 0.0, capacidadeLitros = 0.0;

        System.out.println("Bem-vindo frentista. Comece"
                + " cadastrando os dados do posto!");
        System.out.println("");

        System.out.println("Capacidade do posto (Litros):");
        capacidadeLitros = leitor.nextDouble();
        System.out.println("");

        System.out.println("Valor da gasolina:");
        valorGasolina = leitor.nextDouble();
        System.out.println("");

        metaFaturamento = capacidadeLitros * valorGasolina;
        imposto = metaFaturamento * 0.15;
        System.out.println(String.format("A meta do posto é faturar"
                + " R$%.2f este mês! \nLembre-se que R$%.2f é destinado "
                + "aos impostos.", metaFaturamento, imposto));
        System.out.println("");

        do {
            System.out.println("Escolha os próimos passos:\n"
                    + "1 - Abastecer veículo\n"
                    + "2 - Sair");
            System.out.println("");

            selecaoPassos = leitor.nextInt();

            switch (selecaoPassos) {
                case 1:
                    System.out.println("Digite a quantidade de gasolina (litros):");
                    System.out.println("");

                    break;
                case 2:
                    System.out.println("Até logo!");
                    System.out.println("");

                    break;
                default:
                    System.out.println("Número Inválido!");
                    System.out.println("");

                    break;
            }

            if (selecaoPassos == 1) {

                do {
                    solicitado = leitor.nextInt();

                    if (capacidadeLitros < solicitado) {
                        System.out.println(String.format("Infelizmente não temos a quantidade desejada "
                                + "para abastecimento. Litros disponíveis: %.1f \n"
                                + "Digite uma quantidade válida:", capacidadeLitros));
                        System.out.println("");

                    }
                } while (capacidadeLitros < solicitado);

                capacidadeLitros = capacidadeLitros - solicitado;

                for (int i = 1; i <= solicitado; i++) {
                    System.out.println(String.format("Abastecendo %dº litro", i));
                }

                System.out.println(String.format("Total abastecido: %d, faltam apenas %.1f para a meta!", solicitado, capacidadeLitros));
                System.out.println("");
            }

        } while (selecaoPassos != 2);
    }
}
