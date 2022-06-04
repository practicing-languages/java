package src;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario rafael = new Gerente();
        rafael.setNome("rafael");
        rafael.setCpf("35673077890");
        rafael.setSalario(1850.00);

        System.out.println(rafael.getNome());
        System.out.println(rafael.getSalario());
        System.out.println(rafael.getBonificacao());
    }
}
