import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer idade = 0;
        System.out.println("Insira sua idade:");
        idade = leitor.nextInt();
        classificaIdade(idade);

    }

    public static void classificaIdade(Integer idade) {
        if ((idade > 0) && (idade < 3)) {
            System.out.println("Você é um bebê!");
        } else if ((idade > 2) && (idade < 12)) {
            System.out.println("Você é uma criança!");
        } else if ((idade > 11) && (idade < 20)) {
            System.out.println("Você é um adolecente!");
        } else if ((idade > 19) && (idade < 31)) {
            System.out.println("Você é um jovem!");
        } else if ((idade > 30) && (idade < 61)) {
            System.out.println("Você é um adulto!");
        } else {
            System.out.println("Você é um idoso!");
        }
    }
}
