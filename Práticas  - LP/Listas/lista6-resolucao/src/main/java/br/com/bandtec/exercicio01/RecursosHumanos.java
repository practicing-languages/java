package br.com.bandtec.exercicio01;

public class RecursosHumanos {
    private int totalSalariosReajustados = 0;
    private int totalFuncionariosPromovidos = 0;

    public String infoRH() {
        return "RecursosHumanos{" +
                "totalSalariosReajustados=" + totalSalariosReajustados +
                ", totalFuncionariosPromovidos=" + totalFuncionariosPromovidos +
                '}';
    }

    public void reajustarSalario(Colaborador colaborador, Double reajuste) {
        colaborador.setSalario(((colaborador.getSalario() / 100) * reajuste + colaborador.getSalario()));
        totalSalariosReajustados++;
        System.out.println(colaborador.getNome() + " Novo Salário:" + colaborador.getSalario());
    }

    public void promoverColaborador(Colaborador colaborador, String cargoNovo, Double salarioNovo) {
        if ((colaborador.getSalario()) < salarioNovo) {
            colaborador.setCargo(cargoNovo);
            colaborador.setSalario(salarioNovo);
            totalFuncionariosPromovidos++;
            System.out.println(colaborador.getNome() + " Promovido com sucesso!");
            System.out.println(colaborador.infoColaborador());

        } else {
            System.out.println("Você não pode rebaixar o salário do funcionário " + (colaborador.getNome()) + " Operação Inválida!");
        }
    }
}
