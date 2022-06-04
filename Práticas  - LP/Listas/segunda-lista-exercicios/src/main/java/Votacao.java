import java.util.Scanner;

public class Votacao {
    public Votacao() {
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer qtdVotosMussarela = 0;
        Integer qtdVotosCalabresa = 0;
        Integer qtdVotosQuatroQueijos = 0;

        for (Integer i = 0; i < 10; i = i + 1) {
            System.out.println("\tVote em um sabor:\n Mussarela digite 5;\n Calabresa digite 25;\n Quatro queijos digite 50.");
            Integer voto = leitor.nextInt();
            switch (voto) {
                case 5:
                    qtdVotosMussarela = qtdVotosMussarela + 1;
                    break;
                case 25:
                    qtdVotosCalabresa = qtdVotosCalabresa + 1;
                    break;
                case 50:
                    qtdVotosQuatroQueijos = qtdVotosQuatroQueijos + 1;
                    break;
                default:
                    System.out.println("Valor inválido, esse erro pode afetar o resultado da votação");
            }
        }

        String saborFavorito;
        if (qtdVotosMussarela > qtdVotosCalabresa && qtdVotosMussarela > qtdVotosQuatroQueijos) {
            saborFavorito = "Mussarela";
        } else if (qtdVotosCalabresa > qtdVotosMussarela && qtdVotosCalabresa > qtdVotosQuatroQueijos) {
            saborFavorito = "Calabresa";
        } else if (qtdVotosQuatroQueijos > qtdVotosMussarela && qtdVotosQuatroQueijos > qtdVotosCalabresa) {
            saborFavorito = "Quatro queijos";
        } else {
            saborFavorito = "Nenhum, pois houve um empate";
        }

        System.out.println(String.format("O sabor mussarela obteve %d votos, calabresa %d votos e quatro queijos %d votos.", qtdVotosMussarela, qtdVotosCalabresa, qtdVotosQuatroQueijos));
        System.out.println(String.format("O sabor favotito é: %s", saborFavorito));
    }
}

