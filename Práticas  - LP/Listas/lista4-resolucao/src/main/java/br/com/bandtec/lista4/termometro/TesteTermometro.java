package br.com.bandtec.lista4.termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometroCasa = new Termometro();
        Termometro termometroFebre = new Termometro();
        
        termometroCasa.temperaturaAtual = 32.0;
        termometroCasa.temperaturaMax = 30.0;
        termometroCasa.temperaturaMin = 12.0;
        
        termometroFebre.temperaturaAtual = 36.7;
        termometroFebre.temperaturaMax = 40.0;
        termometroFebre.temperaturaMin = 32.0;
        
        termometroCasa.aumentaTemperatura(5.0);
        termometroCasa.diminuiTemperatura(2.3);
        termometroCasa.exibeFahreinheit();
        
        termometroFebre.aumentaTemperatura(1.0);
        termometroFebre.diminuiTemperatura(0.5);
        termometroFebre.exibeFahreinheit();
        
        System.out.println(termometroCasa.temperaturaAtual);
        System.out.println(termometroFebre.temperaturaAtual);
    }
}