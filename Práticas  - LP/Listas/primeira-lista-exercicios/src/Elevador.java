import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double limitedepeso, pesopessoa1, pesopessoa2, pesopessoa3, pesototal;
        Integer limitedepessoas;

        System.out.println("Insira o limite de peso do elevador:");
        limitedepeso = leitor.nextDouble();

        System.out.println("Insira o limite de pessoas em um elevador:");
        limitedepessoas = leitor.nextInt();

        System.out.println("Insira o peso da 1ª pessoa que entrou no elevador");
        pesopessoa1 = leitor.nextDouble();

        System.out.println("Insira o peso da 2ª pessoa que entrou no elevador");
        pesopessoa2 = leitor.nextDouble();

        System.out.println("Insira o peso da 3ª pessoa que entrou no elevador");
        pesopessoa3 = leitor.nextDouble();

        pesototal = pesopessoa1 + pesopessoa2 + pesopessoa3;

        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n" +
                "O peso total no elevador é de %.2f Kg, sendo que ele suporta %.2f Kg", limitedepessoas, pesototal, limitedepeso));
    }
}
