package exercicio2;

public class Elevador {
    Double pesoAtual;
    Double pesoMaximo;
    Integer totalPassageiros;
    
    public void entrarHomem(){
        if((pesoAtual+90.0) < pesoMaximo){
            pesoAtual += 90.0;
            totalPassageiros += 1;
        } else {
            System.out.println("O elevador atingiu a capacidade máxima, por favor, espere o próximo");
        }
    }
    
    public void entrarMulher(){
          if((pesoAtual+65.0) < pesoMaximo){
            pesoAtual += 65.0;
            totalPassageiros += 1;
        } else {
            System.out.println("O elevador atingiu a capacidade máxima, por favor, espere o próximo");
        }
    }
    
    public void entrarCrianca(){
         if((pesoAtual+40.0) < pesoMaximo){
            pesoAtual += 40.0;
            totalPassageiros += 1;
        } else {
            System.out.println("O elevador atingiu a capacidade máxima, por favor, espere o próximo");
        }
    }
    
    public void mostrarStatusElevador(){
        System.out.println(String.format("O total de passageiros é %d, e o peso atual do elevador é %.2f",totalPassageiros,pesoAtual));
    }
}
