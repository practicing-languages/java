import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double num1, num2, result;

        System.out.println("Insira um número");
        num1 = leitor.nextDouble();

        System.out.println("Insira outro número");
        num2 = leitor.nextDouble();

        result = num1 + num2;
        System.out.println(String.format("O resultado da soma é: %.1f", result));

        result = num1 - num2;
        System.out.println(String.format("O resultado da subtração é: %.1f", result));

        result = num1 * num2;
        System.out.println(String.format("O resultado da multiplicação é: %.1f", result));

        result = num1 / num2;
        System.out.println(String.format("O resultado da divisão é: %.1f", result));

    }
}
