import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        Integer anonascimento, idadefutura;

        System.out.println("Insira seu nome:");
        nome = leitor.nextLine();

        System.out.println(String.format("Olá, %s! Qual o ano do seu nascimento?", nome));
        anonascimento = leitor.nextInt();

        idadefutura = 2030 - anonascimento;
        System.out.println(String.format("Em 2030 você terá %s anos.", idadefutura));
    }
}
