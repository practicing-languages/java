import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double nota1 = 0.0, nota2 = 0.0;

        System.out.println("Digite uma nota:");
        nota1 = leitor.nextDouble();

        System.out.println("Digite outra nota:");
        nota2 = leitor.nextDouble();

        System.out.println("A sua média é: " + calculaMedia(nota1, nota2));

    }

    public static Double calculaMedia(Double nota1, Double nota2) {
        Double notaFinal = 0.0;
        notaFinal = (nota1 * 0.4) + (nota2 * 0.6);
        return notaFinal;
    }
}
