package br.com.bandtec.exercicio04;

public class ProgramaEleicao {
    public static void main(String[] args) {

        UrnaEletronica lula = new UrnaEletronica("Lula");
        UrnaEletronica dilma = new UrnaEletronica("Dilma");

        lula.registrarVoto(lula);
        lula.registrarVoto(lula);
        lula.registrarVoto(lula);
        dilma.registrarVoto(dilma);

        UrnaEletronica.encerrarEleicao(lula, dilma);
    }
}