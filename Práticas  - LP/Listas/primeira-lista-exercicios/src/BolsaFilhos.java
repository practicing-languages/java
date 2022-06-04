import java.util.Scanner;

public class BolsaFilhos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer filhos0a3, filhos4a16, filhos17a18, totalfilhos;
        Double valor0a3, valor4a16, valor17a18, totalbolsa;
        valor0a3 = 25.12;
        valor4a16 = 15.88;
        valor17a18 = 12.44;

        System.out.println("Insira quantos filhos de 0 a 3 anos você possui:");
        filhos0a3 = leitor.nextInt();

        System.out.println("Insira quantos filhos de 4 a 16 anos você possui:");
        filhos4a16 = leitor.nextInt();

        System.out.println("Insira quantos filhos de 17 a 18 anos você possui:");
        filhos17a18 = leitor.nextInt();

        totalfilhos = filhos0a3 + filhos4a16 + filhos17a18;
        totalbolsa = (valor0a3 * filhos0a3) + (valor4a16 * filhos4a16) + (valor17a18 * filhos17a18);

        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalfilhos, totalbolsa));


    }
}
