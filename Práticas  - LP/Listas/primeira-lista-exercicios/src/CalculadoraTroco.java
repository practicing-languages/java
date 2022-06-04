import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double valorunitario, valorpago, troco;
        Integer quantidadevendida;

        System.out.println("Insira o valor unitário do produto:");
        valorunitario = leitor.nextDouble();

        System.out.println("Insira a quantidade vendida:");
        quantidadevendida = leitor.nextInt();

        System.out.println("Insira o valor pago pelo cliente:");
        valorpago = leitor.nextDouble();

        troco = valorpago - (valorunitario * quantidadevendida);
        System.out.println(String.format("Seu troco será de R$%.2f",troco));
    }
}
