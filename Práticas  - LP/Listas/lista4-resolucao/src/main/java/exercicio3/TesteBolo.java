package exercicio3;

public class TesteBolo {
    public static void main(String[] args) {
        Bolo boloPadaria = new Bolo();
        Bolo boloAniversario = new Bolo();
        Bolo boloCasamento = new Bolo();

        
        boloPadaria.sabor = "Fuba";
        boloAniversario.sabor = "Chocolate";
        boloCasamento.sabor = "Nozes";
        
        boloPadaria.valorUnitario = 5.00;
        boloAniversario.valorUnitario = 10.00;
        boloCasamento.valorUnitario = 15.55;
        
        boloPadaria.comprarBolo(2);
        boloAniversario.comprarBolo(3);
        boloCasamento.comprarBolo(1);
        
        boloPadaria.exibirRelatorio();
        boloAniversario.exibirRelatorio();
        boloCasamento.exibirRelatorio();
    }
}
