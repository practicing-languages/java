package br.com.bandtec.exercicio01;

import java.util.Scanner;

public class Empregado {
   private String nome;
   private String cargo;
   private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void reajustarSalario(Double porcentagemReajuste) {
        salario += ((salario / 100) * porcentagemReajuste);
        System.out.println(String.format("Salário Reajustado do funcionário %s: RS%.2f", this.getNome(), this.getSalario()));

    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

}
