package src;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
       // primeiraConta.saldo = 200;
        System.out.println(primeiraConta.getSaldo());

      //  primeiraConta.saldo += 100;
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
      //  segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta);
    }

}