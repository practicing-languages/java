package exercicio3;

public class Bolo {
    String sabor;
    Double valorUnitario;
    Integer quantidadeVendido = 0;
    Double valorTotal;

    public void comprarBolo(Integer qtdDesejada){
        if(qtdDesejada > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        }else{
            quantidadeVendido += qtdDesejada;
        }
    }
    
    public void exibirRelatorio(){
        valorTotal = Double.valueOf(quantidadeVendido) * valorUnitario;
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f",sabor, quantidadeVendido,valorTotal));
    }
}
