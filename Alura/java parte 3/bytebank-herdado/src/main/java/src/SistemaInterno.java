package src;

public class SistemaInterno {

    private int senha = 5555;

    public void autentica(Gerente g){
        boolean autenticou = g.autentica(this.senha);
        if (autenticou){
            System.out.println("Pode entrar no sistema!");
        }else {
            System.out.println("nao pode entrar no sistema!");
        }
    }

}
