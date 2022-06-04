public class ContaCorrente {
    Double saldo;
    Double limiteMax;

    public void sacar(Double valor) {
        saldo += valor;
        System.out.println("Sacado");
    }

    public void depositar(Double valor) {
        if (valor <= limiteMax) {
            saldo += valor;
            System.out.println("Você ta duro!");
        }
    }


}
