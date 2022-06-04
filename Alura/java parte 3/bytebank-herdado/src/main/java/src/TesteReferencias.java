package src;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente jarezinho = new Gerente();
        jarezinho.setNome("marcelinho");
        jarezinho.setSalario(5000.00);

        Funcionario f = new Gerente();
        f.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(jarezinho);
        controle.registra(f);

        System.out.println(controle.getSoma());

    }
}
