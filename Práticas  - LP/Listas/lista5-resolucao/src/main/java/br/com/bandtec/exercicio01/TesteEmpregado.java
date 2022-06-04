package br.com.bandtec.exercicio01;

public class TesteEmpregado {
    public static void main(String[] args) {

        Empregado joao = new Empregado("João Silva", "Analista de Sistemas", 5400.00);
        Empregado rafael = new Empregado("Rafael Coelho", "Desenvolvedor FullStack", 3000.00);

        joao.reajustarSalario(15.0);
        rafael.reajustarSalario(30.0);
    }
}
