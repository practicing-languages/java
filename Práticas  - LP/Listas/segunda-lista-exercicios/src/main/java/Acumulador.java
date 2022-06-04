import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer soma = 0, ultimo = 0;

        do {
            System.out.println("Insira um número para somar:");
            ultimo = leitor.nextInt();
            if (ultimo > 0) {
                soma += ultimo;
            }

        } while (ultimo > 0);

        System.out.println(String.format("A soma dos números inseridos é %d", soma));
    }
}