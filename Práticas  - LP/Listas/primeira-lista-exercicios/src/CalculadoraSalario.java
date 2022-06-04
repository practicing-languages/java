import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double salario, porcentagem, salarioliquido;

        System.out.println("Insira seu salário:");
        salario = leitor.nextDouble();

        System.out.println("Insira a porcentagem de imposto que você deverá pagar:");
        porcentagem = leitor.nextDouble();

        salarioliquido = salario - (salario/100 * porcentagem);

        System.out.println(String.format("Seu salário líquido será R$%.2f",salarioliquido));


    }
}
