import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String login, senha;
        Integer quantidade;

        System.out.println("Insira seu Login:");
        login = leitor.nextLine();

        System.out.println("Insira seu Senha:");
        senha = leitor.nextLine();

        System.out.println("Insira a quantidade de vezes que você aceita errar a senha antes do bloqueio");
        quantidade = leitor.nextInt();

        System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado."
                , login, senha, quantidade));
    }
}
