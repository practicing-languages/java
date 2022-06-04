package br.com.bandtec.exercicio01;

public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        System.out.println(infoColaborador());

    }

    public String infoColaborador() {
        return "Colaborador{" +
                "Nome='" + nome + '\'' +
                ", Cargo='" + cargo + '\'' +
                ", Salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
