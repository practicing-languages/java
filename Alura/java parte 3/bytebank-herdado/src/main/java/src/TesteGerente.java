package src;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente jare = new Gerente();
        jare.setNome("marcelo jare");
        jare.setCpf("35673077890");
        jare.setSalario(5000);

        System.out.println(jare.getNome());
        System.out.println(jare.getSalario());
        System.out.println(jare.getCpf());

        jare.setSenha(2222);
        boolean autenticou = jare.autentica(2222);
        System.out.println(autenticou);
    }
}
