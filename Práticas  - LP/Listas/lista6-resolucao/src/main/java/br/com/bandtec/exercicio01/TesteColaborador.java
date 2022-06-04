package br.com.bandtec.exercicio01;

public class TesteColaborador {
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();

        Colaborador rafael = new Colaborador("Rafael", "Dev", 2000.0);
        Colaborador celia = new Colaborador("Célia", "Dev Senior", 10000.0);

        rh.promoverColaborador(rafael, "Analista", 2030.0);
        rh.promoverColaborador(celia, "Analista", 2030.0);

        rh.reajustarSalario(celia, 10.0);
        rh.reajustarSalario(celia, 10.0);
        rh.reajustarSalario(rafael, 10.0);

        System.out.println(celia.infoColaborador());
        System.out.println(rafael.infoColaborador());

        System.out.println(rh.infoRH());

    }
}
