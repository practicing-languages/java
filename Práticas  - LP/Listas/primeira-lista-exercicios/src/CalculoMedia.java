import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        Double nota1, nota2, media;

        System.out.println("Insira seu nome:");
        nome = leitor.nextLine();

        System.out.println("Insira uma nota:");
        nota1 = leitor.nextDouble();

        System.out.println("Insira outra nota:");
        nota2 = leitor.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println(String.format("Olá %s. Sua média foi de %.1f", nome, media));
    }
}
