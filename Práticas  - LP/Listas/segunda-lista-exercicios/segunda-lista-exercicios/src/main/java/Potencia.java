import java.util.Scanner;

public class Potencia {
    public Potencia() {
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer resultado = 1, base = 0, expoente = 0, expoenteInicial = 0;

        System.out.println("Digite a base:");
        base = leitor.nextInt();

        System.out.println("Digite um expoente:");
        expoente = leitor.nextInt();
        expoenteInicial = expoente;

        while (expoente > 0) {
            resultado = resultado * base;
            expoente = expoente - 1;
        }

        System.out.println(String.format("O resultado de %d elevado a %d é igual a %d", base, expoenteInicial, resultado));
    }
}
