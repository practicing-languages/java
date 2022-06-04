/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.aula;

import java.util.Scanner;

/**
 *
 * @author CYOT7
 */
public class ExemploEstruturaRepeticao {
    
    public static void main(String[] args) {
        
        Integer cont, numero;
        Scanner leitor = new Scanner(System.in);
        
        // as estrutura de repetição são 3: 
        // for, while e do while
        
        // Exemplo de uso de for
        // Exibir os números de 1 a 7
        System.out.println("\nExibindo de 1 a 7 usando for");
        for (Integer i = 1; i <= 7; i++) {
            System.out.println(String.format("Contador: %d", i));
        }
        
        // Mesmo exemplo usando while
        System.out.println("\nExibindo de 1 a 7 usando while");
        cont = 1;
        while (cont <= 7) {
            System.out.println(String.format("Contador: %d", cont));
            cont++;
        }
        
        // Exibir de 7 a 1 usando for
        System.out.println("\nExibindo de 7 a 1 usando for");
        for (Integer i = 7; i >= 1; i--){
            System.out.println(String.format("Contador: %d", i));
        }
        
        // Exibir de 7 a 1 usando while
        System.out.println("\nExibindo de 7 a 1 usando while");
        cont = 7;
        while (cont >= 1) {
            System.out.println(String.format("Contador: %d", cont));
            cont--;
        }
        
        // A 3a estrutura de repetição é o do while
        // Exemplo de exibir de 1 a 7 usando do while
        System.out.println("\nExibindo de 1 a 7 usando do while");
        cont = 1;
        do {
            System.out.println(String.format("Contador: %d", cont));
            cont++;
        } while (cont <= 7);
        
        // A diferença entre while e do while é que no while a comparação
        // é feita antes de entrar no loop. Se for falsa, nem entra.
        
        // No do while, o trecho do loop é executado sempre pelo menos uma vez,
        // pq a comparação é feita sempre no final do trecho que repete.
        
        // O do while é útil quando, por exemplo, queremos validar o valor 
        // digitado
        do {
            System.out.println("Digite um número maior do que zero");
            numero = leitor.nextInt();
        } while (numero <= 0);
        
        
        // Resolução usando for para exibir os ímpares de 0 a 90
        // usando if 
        System.out.println("\nExibindo os ímpares de 0 a 90, usando if");
        for (Integer i = 0; i <= 90; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        // Idem, mas sem usar if, começando de 1 e contando de 2 em 2
        System.out.println("\nExibindo os ímpares de 0 a 90, sem if, usando i = i+2 para atualizar o valor de i");
        for (Integer i = 1; i <= 90; i = i + 2) {
            System.out.println(i);
        }
        
        // Idem ao anterior
        System.out.println("\nExibindo os ímpares de 0 a 90, sem if, usando i += 2 para atualizar o valor de i");
        for (Integer i = 1; i <= 90; i += 2) {
            System.out.println(i);
        }
        
    }
    
}
