/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exemplo.metodo;

import java.util.Scanner;

/**
 *
 * @author CYOT7
 */
public class ExemploMetodo {
    
    /* Método exibeAsterisco - não recebe argumentos
       Exemplo de método void (não retorna valor)
       Apenas exibe uma linha de asteriscos
    */
    public static void exibeAsterisco() {
        System.out.println("***********************************");
    }
    
    /* Método exibeQuadro - não recebe argumentos
       Exemplo de método void (não retorna valor)
       Apenas exibe um quadro de asteriscos
    */
    public static void exibeQuadro() {
        exibeAsterisco();  // chama o método anterior para exibir uma linha de asteriscos
        System.out.println("***                             ***");
        exibeAsterisco();
    }
    
    
    /* Método exibeQuadro - recebe um argumento String
       Exibe um quadro de asteriscos com a frase no meio do quadro
       AGORA TEMOS 2 MÉTODOS exibeQuadro 
       DIZEMOS QUE SÃO MÉTODO SOBRECARREGADOS
       métodos de mesmo nome com lista diferente de argumentos
    */
    public static void exibeQuadro(String frase) {
        exibeAsterisco();
        System.out.println("***          " + frase + "          ***");
        exibeAsterisco();
    }
    
    public static void main(String[] args) {
        Integer resultado;
        Integer a, b;
        Scanner leitor = new Scanner(System.in);
        
        exibeAsterisco();   // chamada do método
        System.out.println("");
        exibeQuadro();   // exibe um quadro vazio
        System.out.println("");
        exibeQuadro("Boa noite");  // exibe um quadro com a frase Boa noite
        System.out.println("");
        exibeQuadro("Tudo bem?");  // exibe um quadro com a frase Tudo bem?
        
        System.out.println("");
        
        // MANEIRA ERRADA DE SE CHAMAR UM MÉTODO QUE RETORNA VALOR
        // PORQUE ESTAMOS IGNORANDO O RETORNO DO MÉTODO
        soma(2, 3);
        
        // EXISTEM 2 MANEIRAS DE SE CHAMAR UM MÉTODO QUE RETORNA VALOR
        // PRIMEIRA: DENTRO DE UM SOUT
        // quando só queremos exibir o retorno do método
        System.out.println("A soma de 2 e 3 é " + soma(2, 3));
        
        // SEGUNDA: ATRIBUINDO A CHAMADA DO MÉTODO A UMA VARIÁVEL
        // neste caso, é útil se pretendemos usar o valor do retorno
        // não só para exibir
        resultado = soma(10, 77);
        System.out.println("A soma de 10 e 77 é " + resultado);
        
        // Solicita que o usuário digite 2 valores inteiros
        System.out.println("Digite 2 números inteiros");
        a = leitor.nextInt();
        b = leitor.nextInt();
        // chama o método soma e o maior passando os valores lidos
        System.out.println(String.format("A soma de %d e %d é %d", 
                                          a, b, soma(a,b)));
        System.out.println("O maior número entre eles é " +
                           maior(a, b) );
        
        // chamada do método soma que recebe Doubles
        System.out.println("A soma de 4.5 e 6.0 é " + soma(4.5,6.0));
        
        // chamada do método media que recebe 2 valores
        System.out.println(String.format("A média de 6 e 5 é %.2f", 
                                         media(6.0, 5.0)));

        // chamada do método media que recebe 2 valores
        System.out.println(String.format("A média de 6, 5 e 4 é %.2f", 
                                         media(6.0, 5.0, 4.0)));
    }
    
    /* Método soma - recebe 2 números inteiros e retorna a soma deles 
       Neste método, fazemos a conta no próprio return
    */
    public static Integer soma (Integer a, Integer b) {
        return a + b;
    }

    /* Método soma1 - recebe 2 números inteiros e retorna a soma deles 
       Neste método, não fazemos a conta no return
       Utilizamos uma variável para armazenar o resultado da soma
    */
    public static Integer soma1 (Integer a, Integer b) {
        Integer resultado;
        resultado = a + b;
        return resultado;
    }
    
    /* Método soma - recebe 2 números Double e retorna a soma deles
       Este é outro exemplo de método sobrecarregado */
    public static Double soma (Double a, Double b) {
        return a + b;
    }
    
    /* Método maior - recebe 2 números inteiros e retorna o maior deles */
    public static Integer maior (Integer x, Integer y) {
        if (x >= y) {
            return x;
        }
        else { 
            return y;
        }    
    }
    
    // MAIS UM EXEMPLO DE MÉTODO SOBRECARREGADO
    /* Método media - recebe 2 números Double e retorna a média deles */
    public static Double media (Double num1, Double num2) {
        return (num1 + num2) / 2;
    }
    
    /* Método media - recebe 3 números Double e retorna a média deles */
    public static Double media (Double num1, Double num2, Double num3) {
        return (num1 + num2 + num3) / 3;
    }
    
    
    
    
}
