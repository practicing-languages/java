import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String login = "admin", senha = "#Bandtec", loginInserido = "", senhaInserida = "";

        do {
            System.out.println("Insira seu login:");
            loginInserido = leitor.nextLine();

            System.out.println("Insira sua senha:");
            senhaInserida = leitor.nextLine();

            if (!loginInserido.equals(login) || !senhaInserida.equals(senha)) {
                System.out.println("Login e/ou senha inválidos!");
            }
        } while (!loginInserido.equals(login) || !senhaInserida.equals(senha));

        if (loginInserido.equals(login) && senhaInserida.equals(senha))
        System.out.println("Login realizado com sucesso!");

    }
}
