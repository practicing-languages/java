/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.aula;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author CYOT7
 */
public class ExemploSwitchCase {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer diaSemana, posicao;
        Integer numAleatorio;
        Double numRealAleatorio;
        
        System.out.println("Digite um número de 1 a 7");
        diaSemana = leitor.nextInt();
        
        // Vamos exibir o dia da semana correspondente ao número digitado
        // Se for 1, exibimos Domingo; se for 2, exibimos Segunda, etc
        
        // Como seria usando if else
        if (diaSemana == 1) {
            System.out.println("Domingo");
        }
        else if (diaSemana == 2) {
            System.out.println("Segunda");
            }
        else if (diaSemana == 3) {
            System.out.println("Terça");
        }  // e assim por diante
        
        // A estrutura switch case substitui esse tipo de lógica de vários if else
        // O switch case pode ser usado com inteiros, Strings e caracteres
        switch (diaSemana) {
            case 1: // diaSemana = 1
                System.out.println("Domingo");
                break;  // o break faz com que a execução saia do switch case
            case 2: // diaSemana = 2
                System.out.println("Segunda");
                break;
            case 3: // diaSemana = 3
                System.out.println("Terça");
                break;
            case 4: // diaSemana = 2
                System.out.println("Quarta");
                break;
            case 5: // diaSemana = 2
                System.out.println("Quinta");
                break;
            case 6: // diaSemana = 2
                System.out.println("Sextou");
                break;
            case 7: // diaSemana = 2
                System.out.println("Sábado");
                break;
            default: // diaSemana é diferente dos valores acima (1 a 7)
                System.out.println("Valor inválido!");
                break;
        }
        
        // Exemplo de uma situação em que é útil não colocar os breaks
        // Supondo que vc participou de um concurso 
        // 1o lugar - ganha um iPhone, um iPad e um iPod
        // 2o lugar - ganha um iPad e um iPod
        // 3o lugar - ganha um iPod
        
        System.out.println("Digite o número correspondente à sua posição no concurso");
        posicao = leitor.nextInt();
        
        System.out.print("Você ganhou ");  // aqui usamos print, para completar a frase no switch case
        
        switch (posicao) {
            case 1:  // 1o lugar
                System.out.print("um iPhone, ");
            case 2:  // 2o lugar
                System.out.print("um iPad e ");
            case 3:  // 3o lugar
                System.out.println("um iPod! Parabéns!");
                break;
            default:  // qq outro lugar
                System.out.println("experiência! Mais sorte da próxima vez!");
                break;
        }
        
        // Geração de número aleatório ou randômico
        // Em Java, existem várias formas de se gerar números aleatórios
        // Como por exemplo: Random, Math.random
        
        // Usaremos o ThreadLocalRandom
        // Vamos supor que estamos simulando um jogo de dado
        // O exemplo a seguir gera um número aleatório de 1 a 6
        numAleatorio = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println("Número gerado: " + numAleatorio);
        
        // o mesmo vale para número aleatório do tipo Double
        // o exemplo a seguir gera um número real aleatório entre 0 e 10 (não inclui o 10)
        numRealAleatorio = ThreadLocalRandom.current().nextDouble(0, 10);
        System.out.println("Número real gerado: " + numRealAleatorio);
        
        
        
        
        
    }
    
}
