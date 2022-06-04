import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero = 0;
        do {
            System.out.println("Digite um número:");
            numero = leitor.nextInt();
            verificaPrimo(numero);
        } while (numero >= 0);
    }

    public static void verificaPrimo(Integer numero) {
        Integer contador = 0;

        for (Integer i = 1; i <= numero; i++) {
            Integer divisao = numero / i;

            if (numero % i == 0) {
                contador++;
            }

        }
        if (contador == 2) {
            System.out.println("Este numero é primo!");
            System.out.println("");
        } else {
            System.out.println("Este Número não é primo!");
            System.out.println("");
        }
    }
}
