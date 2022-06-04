/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.aula;

import java.util.Scanner;

/**  Resolução do exercício da Sorveteria, feita em aula pelos alunos
 *   Bruno e Beatriz
 * 
 */
public class Sorveteria {
    
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
       Scanner leitorNL = new Scanner(System.in);  // para entrada usando nextLine()
       Integer escolha;
       String mensagem = "Preço: R$ ", menu;
       
       // Resolução usando Integer no switch
       System.out.println("De qual produto quer ver o preço?");
       System.out.println("Casquinha(1) Sundae(2), Banana Split(3)");
       escolha = leitor.nextInt();
       
       switch (escolha){
           case 1:
               mensagem += "3,00";
               break;
           case 2:
               mensagem += "5,00";
               break;
           case 3:
               mensagem += "7,00";
               break;
           default:
               mensagem = "Opção inválida";
               break;
       }
       
        System.out.println(mensagem);

        
        // Resolução usando String no Switch
        System.out.println("Escreva uma opção");
        menu = leitorNL.nextLine();
        
        mensagem = "Preço: R$ ";
                
        switch (menu){
            case "Casquinha":
            case "casquinha":   // opcional para permitir que o usuário digite Casquinha ou casquinha
                mensagem += "3,00";
                break;
            case "Sundae":
                mensagem += "5,00";
                break;
            case "Banana Split":
                mensagem += "7,00";
                break;
                
            default: 
                mensagem = "Invalida";
                break;                
        }
        System.out.println(mensagem);
        
        
        // Outra maneira de tratar os caracteres minúsculos e maiúsculos é 
        // converter o que o usuário digitou para caracteres em minúsculo
        // Exemplo:
        switch (menu.toLowerCase()) {
            case "casquinha":
              // etc
        }
        
            
    }
    
}
