package br.com.bandtec.lista4.termometro;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    public Double aumentaTemperatura(Double addTemp) {
        temperaturaAtual += addTemp;
        if(temperaturaAtual > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        }
        return temperaturaAtual;
    }
    
     public Double diminuiTemperatura(Double subTemp) {
        temperaturaAtual -= subTemp;
        if(temperaturaAtual < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        }
        return temperaturaAtual;
    }
     
     public void exibeFahreinheit(){
         Double exibeFahreinheit;
         exibeFahreinheit = (temperaturaAtual * 1.8) + 32;
         System.out.println(String.format("A temperatura em fahreinheit é equivalente a %.2f", exibeFahreinheit));
     }
}
