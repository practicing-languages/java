import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer quantidadeCadeira = 0, porcentagem = 0, opcao = 0, quantidadeDesejada = 0;
        Integer cadeirasDisponiveis = 0;

        System.out.println("Bem-vindo administrador! Primeiro cadastre uma sala do cinema:");
        System.out.println("Quantidade de cadeiras da sala:");
        quantidadeCadeira = leitor.nextInt();

        System.out.println("Capacidade máxima devido a pandemia (%):");
        porcentagem = leitor.nextInt();

        cadeirasDisponiveis = (quantidadeCadeira / 100) * porcentagem;

        System.out.println(String.format("A sala possui %d ingressos disponiveis!", cadeirasDisponiveis));
        do {
            System.out.println("Escolha os próximos passos:\n" +
                    "1 - Reservar Ingressos\n" +
                    "2 - Sair");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade de cadeiras desejadas:");
                    reservarIngressos(quantidadeDesejada, leitor, cadeirasDisponiveis);
                    break;
                case 2:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Número Inválido!");
                    break;
            }

        } while (opcao != 2);
    }

    public static void reservarIngressos(Integer quantidadeDesejada, Scanner leitor, Integer cadeirasDisponiveis) {

        do {
            quantidadeDesejada = leitor.nextInt();

            if (quantidadeDesejada > cadeirasDisponiveis) {
                System.out.println(String.format("Infelizmente não temos a quantidade de cadeiras digitadas, quantidade disponível: %d\n" +
                        "Digite uma quantidade válida:", cadeirasDisponiveis));
            }


            }while (cadeirasDisponiveis < quantidadeDesejada) ;

            //cadeirasDisponiveis = cadeirasDisponiveis - quantidadeDesejada;


            for (int i = 1; i <= quantidadeDesejada; i++) {
                cadeirasDisponiveis--;

                System.out.println(String.format("Venda do %dº ingresso registrada, restam %d ingressos", i, cadeirasDisponiveis));

            }

            System.out.println(String.format("Você comprou %d ingressos, bom filme!", quantidadeDesejada));
        }

    }


