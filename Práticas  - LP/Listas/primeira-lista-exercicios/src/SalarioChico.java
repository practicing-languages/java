import java.util.Scanner;

public class SalarioChico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double salariobruto, conducaototal, salarioliquido, totaldescontos;
        Integer inss, ir;
        inss = 10;
        ir = 20;
        System.out.println("Insira seu salário bruto:");
        salariobruto = leitor.nextDouble();

        System.out.println("Insira quanto custa a condução diária só de ida da casa para o trabalho");
        conducaototal = leitor.nextDouble() * 44;

        salarioliquido = salariobruto - (salariobruto/100 * inss) - (salariobruto/100 * ir) - conducaototal;
        totaldescontos = salariobruto - salarioliquido;
        System.out.println(String.format("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f ", salariobruto, totaldescontos, salarioliquido
        ));






    }
}
