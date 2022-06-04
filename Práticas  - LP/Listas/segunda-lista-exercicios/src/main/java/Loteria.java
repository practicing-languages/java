import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer numUsuario, numAleatorio, contador = 0;

        System.out.println("Digite um número entre 0 e 10");
        numUsuario = userInput.nextInt();

        do {
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            contador++;
        } while (numUsuario != numAleatorio);

        if (contador <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (contador <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}