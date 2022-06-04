/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exemplo.aluno;

/**
 *
 * @author CYOT7
 */
public class Aluno {
    
    // Atributos - são variáveis definidas dentro do corpo da classe
    //             e fora do corpo dos métodos
    
    private String ra;          // RA do aluno
    private String nome;        // Nome do aluno
    private Double nota1;       // Nota1 do aluno
    private Double nota2;       // Nota2 do aluno
    private Integer qtdFalta;   // Quantidade de faltas do aluno

    public Aluno(String ra, String nome, Double nota1, Double nota2, Integer qtdFalta) {
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.qtdFalta = qtdFalta;
    }

    // Métodos - representação dos comportamentos dos objetos
    //           que serão criados a partir desta classe
    
    /* Método visualizarNota() - implementa o comportamento do aluno 
                                 visualizar suas notas */
    public void visualizarNota() {
        System.out.println(String.format("\nRA: %s - Nome: %s", ra, nome));
        System.out.println(String.format("Nota1: %.2f", nota1));
        System.out.println(String.format("Nota2: %.2f", nota2));
    }
    
    /* Método visualizarFalta()  - implementa o comportamento do aluno 
                                   visualizar suas faltas */
    public void visualizarFalta() {
        System.out.println(String.format("\nRA: %s - Nome: %s", ra, nome));
        System.out.println(String.format("Faltas: %d", qtdFalta));
    }
    
    /* Método visualizarStatus() */
    public void visualizarStatus() {
        Double media;
        media = nota1 * 0.4 + nota2 * 0.6;
        if (media >= 6.0) {
            System.out.println(String.format("\nStatus do aluno %s: Aprovado com média %.2f",
                               nome, media));
        }
        else {
            System.out.println(String.format("\nStatus do aluno %s: Reprovado com média %.2f",
                               nome, media));
        }
    
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Integer getQtdFalta() {
        return qtdFalta;
    }

    public void setQtdFalta(Integer qtdFalta) {
        this.qtdFalta = qtdFalta;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", qtdFalta=" + qtdFalta +
                '}';
    }
}
