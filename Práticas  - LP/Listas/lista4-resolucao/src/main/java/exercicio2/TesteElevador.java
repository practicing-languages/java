package exercicio2;

public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador();
        Elevador elevador2 = new Elevador();
        
        elevador1.pesoMaximo = 500.00;
        elevador1.pesoAtual = 0.0;
        elevador1.totalPassageiros = 0;

        elevador2.pesoMaximo = 250.00;
        elevador2.pesoAtual = 0.0;
        elevador2.totalPassageiros = 0;
        
        elevador1.entrarHomem();
        elevador1.entrarHomem();
        elevador1.entrarMulher();
        elevador1.entrarCrianca();
        elevador1.entrarCrianca();
        
        elevador2.entrarHomem();
        elevador2.entrarMulher();
        elevador2.entrarMulher();
        elevador2.entrarCrianca();
        elevador2.entrarHomem();
        elevador2.entrarHomem();
        elevador2.entrarCrianca();
        
        elevador1.mostrarStatusElevador();
        elevador2.mostrarStatusElevador();
    }
}
