import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroSolicitado;

        System.out.println("Digite um número:");
        numeroSolicitado = leitor.nextInt();

        System.out.println(String.format("Taboada do %d:", numeroSolicitado));
        for (int i = 0; i <= 10; i++) {
            //System.out.println(numeroSolicitado + " x " + i + " = " + (numeroSolicitado*i));

            //Outra forma de fazer
            System.out.println(String.format("%d x %d = %d", numeroSolicitado, i, (numeroSolicitado * i)));
        }

    }
}
