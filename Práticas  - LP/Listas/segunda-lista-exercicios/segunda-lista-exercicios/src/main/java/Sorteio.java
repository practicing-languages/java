import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer numeroSelecionado, numAleatorio, contadorPar, contadorImpar, rodadaSorteada, contadorPrimeiraVez;
        contadorPrimeiraVez = 0;
        contadorImpar = 0;
        contadorPar = 0;
        rodadaSorteada = 0;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número para o sorteio de 1 a 100:");
        numeroSelecionado = leitor.nextInt();

        for (int i = 1; i <= 200; i++) {
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
            if ((numeroSelecionado == numAleatorio) && (contadorPrimeiraVez == 0)) {
                contadorPrimeiraVez++;
                rodadaSorteada = i;
                System.out.println(String.format("O seu número foi sorteado na rodada %d", rodadaSorteada));
            }
            if (numAleatorio % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println(String.format("Foram sorteados %d números pares \n" +
                "Foram sorteados %d números impares", contadorPar, contadorImpar));

    }
}
