/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exemplo.aluno;


/**
 * @author CYOT7
 */
public class App {

    public static void main(String[] args) {

        // Criar o 1o objeto da classe Aluno
        // Criar um objeto = instanciar uma classe
        // Objeto = instância da classe
        Aluno daniel = new Aluno("01211025", "Daniel Pederzini", 8.7, 9.8, 5);

        // Atribuir valores para os atributos do objeto daniel


//        daniel.setRa("01211025");
//        daniel.setNome("Daniel Pederzini");
//        daniel.setNota1(8.7);
//        daniel.setNota2(9.8);
//        daniel.setQtdFalta(5);

        // Chamando os métodos do objeto daniel
        daniel.visualizarNota();
        daniel.visualizarFalta();


        // Instanciando outro objeto
        Aluno bruna = new Aluno("01211015","Bruna Sato",10.0,7.0,0);

        // Atribuir valores para os atributos do objeto bruna
//        bruna.setRa("01211015");
//        bruna.setNome("Bruna Sato");
//        bruna.setNota1(10.0);
//        bruna.setNota2(7.0);
//        bruna.setQtdFalta(0);

        // Chamando os métodos do objeto bruna
        bruna.visualizarNota();
        bruna.visualizarFalta();

        System.out.println("\nO aluno " + daniel.getNome() + " de RA " + daniel.getRa() + " tem " +
                daniel.getQtdFalta() + " faltas.");

        // Exibindo os status dos alunos
        daniel.visualizarStatus();
        bruna.visualizarStatus();

        // Instanciando outro objeto
        Aluno pateta = new Aluno("01211999","Pateta Disney",5.0,5.5,20);

        // Atribuir valores para os atributos do objeto bruna
//        pateta.setRa("01211999");
//        pateta.setNome("Pateta Disney");
//        pateta.setNota1(5.0);
//        pateta.setNota2(5.5);
//        pateta.setQtdFalta(20);

        // Chamando os métodos do objeto pateta
        pateta.visualizarNota();
        pateta.visualizarFalta();
        pateta.visualizarStatus();

        System.out.println(pateta.toString());
    }

}


