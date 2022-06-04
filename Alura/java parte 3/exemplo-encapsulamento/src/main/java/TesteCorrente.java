public class TesteCorrente {
    public static void main(String[] args) {
        ContaCorrente contaJonas = new ContaCorrente();
        contaJonas.limiteMax = 100.0;
        contaJonas.saldo = 100.0;
        contaJonas.depositar(2.0);
        System.out.println("Saldo " + contaJonas.saldo);


    }
}
