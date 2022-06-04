/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.primeiro.programa.java;

import java.util.Scanner;



/**
 *
 * @author CYOT7
 */
public class PrimeiroPrograma {
    
    /* isso é um comentário */
    // isso tb é um comentário
    
    /* para gerar o método main, digite main seguido de TAB
       ou digite psvm seguido de TAB
    */
 
    public static void main(String[] args) {
        
        // para gerar o comando println, digite sout seguido de TAB
        System.out.println("Olá");
        // \t indica um TAB na exibição
        // \n indica uma quebra de linha
        // O método println exibe o que ele recebe como argumento e já
        // muda de linha
        // O método print tb exibe o que ele recebe como argumento, mas
        // não muda de linha
        System.out.print("Boa \tnoite!");
        System.out.println("Tudo \n bem?");
        
        // Para passar argumentos para o main, defina em
        // File > Project Properties - Categoria Run - Arguments
        //System.out.println("Tudo bem, " + args[0] + "?");
        
        // Declarando uma variável do tipo String, para armazenar
        // caracteres (texto)
        
        String nome;
        String a, b= "abc", c;  // é possível declarar várias variáveis
                                // numa mesma linha
                                // para atribuir valores, usamos o sinal de =

        // Declarando variável do tipo inteiro, que armazena números
        // sem casas decimais
        Integer numero;
        numero = 3;   // atribuição
        Integer num1, num2, resultado;
        num1 = 5;
        num2 = 7;
        resultado = num1 + num2;    // adição: sinal de +
        resultado = num1 * num2;    // multiplicação: *
        resultado = num1 - num2;    // subtração: -
        resultado = num1 / num2;    // divisão: /
        
        num1 = 9;
        num2 = 2;
        resultado = num1 / num2;
        // Como num1, num2 e resultado são inteiros, a divisão
        // será "truncada"
        System.out.println("resultado = " + resultado);
        
        // Declarando variável do tipo real, para números com casas decimais
        Double resultado2;
        // A instrução abaixo dá erro de conversão de tipos
        // resultado2 = num1 / num2;
        // Convertendo um dos 2 números para Double, já resolve o problema
        // Para converter para Double, usamos o método Double.valueOf
        resultado2 = Double.valueOf(num1) / num2;
        System.out.println("resultado2 = " + resultado2);
        
        // Para que um número inteiro seja considerado Double, 
        // devo colocar um ponto seguido de zero
        resultado2 = 1 / 2.0;
        System.out.println("resultado2 = " + resultado2);
        
        // Declarando uma variável do tipo caractere
        // caracteres são sempre definidos entre aspas simples
        Character letra = 'X';
        
        // Declarando variável booleana
        Boolean aprovado = false;
        
        // Para ler do teclado vamos utilizar um objeto da classe 
        // Scanner
        Scanner leitor = new Scanner(System.in);
        // Criando um 2o objeto leitor específico para ler com nextLine()
        // porque senão o nextLine() consome o <Enter> de alguma leitura
        // anterior e não deixa o usuário digitar
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        // Para ler Strings, posso usar o método next ou nextLine
        // O método next() lê apenas a primeira palavra digitada
        // O método nextLine() lê tudo o que for digitado até o ENTER
        nome = leitorNL.nextLine();
        System.out.println("Oi, " + nome);
        
        // Para ler números inteiros, utilizo o método nextInt()
        System.out.println("Digite a sua idade");
        Integer idade, anoNascimento;
        idade = leitor.nextInt();
        System.out.println("Sua idade é " + idade);
        // Calculando o ano de nascimento a partir da idade
        anoNascimento = 2021 - idade;
        System.out.println("Você nasceu em " + anoNascimento);
        
        // Para ler números reais, utilizo o método nextDouble()
        // Quando o programa vai ler o número, deve-se informar vírgula no
        // lugar de ponto
        Double nota1, nota2, media;
        System.out.println("Digite a nota 1");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = leitor.nextDouble();
        System.out.println("Nota1: " + nota1 + "\nNota2: " + nota2);
        
        // Calculando e exibindo a média das notas
        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        
        // Interpolação de texto
        // Usamos o método String.format para produzer uma String formatada
        // String.format("texto da mensagem", variáveis...)
        // No texto da mensagem, no lugar onde deve aparecer o valor
        // da variável, colocamos o formato desejado para o valor
        // %d - formato para números inteiros
        // %s - formato para String
        // %f - formato para números reais
        // %.2f - limitando em 2 casas decimais 
        System.out.println(String.format
        ("A nota1 é %.2f, a nota2 é %.2f e a média é %.2f", 
                nota1, nota2, media));
        System.out.println(String.format(
                "Nome: %s\nIdade: %d\nMédia: %.1f",
                nome, idade, media));
        // Como fazer aparecer a \ na exibição
        System.out.println("Digite \\n para quebrar linha");
        // Como fazer aparecer aspas na exibição
        System.out.println("\"Sim\"");
        
        // Criando Strings numéricas e convertendo-as para inteiro
        String snum1, snum2;
        // Caractere 1 = '1' internamente é representado pelo Código ASCII
        // '1' é representado pelo 31H = 0011 0001 em binário
        // Inteiro 1 internamente é representado em binário
        // 1 é representado por 0000 0001
        snum1 = "10";
        snum2 = "7.7";
        System.out.println(snum1 + snum2); // concatenação das Strings
        // convertendo String para inteiro
        num1 = Integer.valueOf(snum1);
        // convertendo String para Double
        resultado2 = Double.valueOf(snum2);
        System.out.println(num1 + resultado2); // soma dos valores
        
        // Estrutura de seleção
        // Exemplo de if sem else
        if (media >= 6) {
            System.out.println("Aprovado");
        }
        
        // Exemplo de if com else
        // num1 é par ou ímpar ?
        // operação que retorna o resto da divisão: %
        if (num1 % 2 == 0) {
            System.out.println("num1 é par");
        }
        else {
            System.out.println("num1 é ímpar");
        }
        
        // na comparação utilizo ==, !=, >, >=, <, <=
        
        // Como comparar se uma String é igual a outra?
        String faculdade;
        System.out.println("Digite o nome da sua Faculdade");
        faculdade = leitorNL.nextLine();
        // Comparando a String faculdade com "Bandtec"
        // Se é igual
        if (faculdade.equals("Bandtec")) {
            System.out.println("Ótima escolha!!!");
        }
        
        // Se é diferente
        if (!faculdade.equals("Bandtec")) {
            System.out.println("Vem pra Bandtec!");
        }
        
        // Como estamos usando tipo Integer e Double, os números
        // criados são objetos e por isso podemos usar .equals
        // para compará-los
        
        if (num1.equals(15)) {
            // num1 é igual a 15
        }
        if (!num1.equals(35)) {
            // num1 é diferente de 35
        }
        
        // Assim como no JavaScript, usamos && para AND e || para OR
        if (nota1 >=0 && nota1 <= 10) {
            System.out.println("A nota1 é válida!");
        }
        
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("A nota2 é inválida!");
        }
        
        // Digitando 3 números numa única linha, separados por espaço
        System.out.println("Digite 3 números");
        num1 = leitor.nextInt();  // Lê o 1o número
        num2 = leitor.nextInt();  // Lê o 2o número
        Integer num3 = leitor.nextInt(); // Lê o 3o número
        System.out.println("num1 = " + num1 + ", num2 = " + num2 +
                           ", num3 = " + num3);
        
        System.out.println("Digite o seu nome");
        // Essa leitura dá aquele problema de não parar para o usuário
        // digitar, pois esse nextLine consome o <Enter> da leitura anterior
        nome = leitor.nextLine();
    }
    
    
    
}
