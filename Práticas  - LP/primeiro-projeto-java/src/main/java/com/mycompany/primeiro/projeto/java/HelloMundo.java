/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeiro.projeto.java;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class HelloMundo {
    public static void main(String[] args) {
          System.out.println("hello world\t \n" + args[0]);
          
          String nome;
          String a, b= "abcd", c;
          
          Integer number;
          number = 3;
          
    Scanner leitor = new Scanner(System.in);
    
        System.out.println("digite seu nome");
        nome = leitor.next();
        System.out.println(nome);
          
          System.out.println("digite sua idade ");
          
          Integer idade;
          idade = leitor.nextInt();
                  System.out.println("sua idade é " + idade);
          for(Integer i= 0; i<10;i++){
              System.out.println("kkkkkkkkkkk");
          }
          
          
    }
    
    
    
    
    
    
    
    
    
}
