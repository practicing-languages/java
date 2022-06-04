import java.util.Scanner;

public class QuantidadeCalorias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        Integer minutosaquecimento, minutosaerobicos, minutosmusculacao, totalminutos;
        Integer caloriasaqueciemto, caloriasaerobico, caloriasmusculacao, totalcalorias;
        caloriasaqueciemto = 12;
        caloriasaerobico = 20;
        caloriasmusculacao = 25;

        System.out.println("Insira seu nome:");
        nome = leitor.nextLine();

        System.out.println("Insira o tempo em minutos que você passou se aquecendo:");
        minutosaquecimento = leitor.nextInt();

        System.out.println("Insira o tempo em minutos que você passou fazendo exercicios aerobicos:");
        minutosaerobicos = leitor.nextInt();

        System.out.println("Insira o tempo em minutos que você passou fazendo musculação:");
        minutosmusculacao = leitor.nextInt();

        totalminutos = minutosaquecimento + minutosaerobicos + minutosmusculacao;

        totalcalorias = (minutosaquecimento * caloriasaqueciemto) + (minutosaerobicos * caloriasaerobico) + (minutosmusculacao * caloriasmusculacao);

        System.out.println(String.format("Olá, %s. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", nome, totalminutos, totalcalorias));
    }
}
