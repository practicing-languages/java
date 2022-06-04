package br.com.bandtec.exercicio02;

public class ProgramaCampeonato {
    public static void main(String[] args) {

        Clube palmeiras = new Clube("Palmeiras");
        Clube saoPaulo = new Clube("São Paulo");

        palmeiras.registrarVitoria(palmeiras);
        saoPaulo.registrarDerrota(saoPaulo);
        Clube.resumoRodada(saoPaulo, palmeiras);

        palmeiras.registrarEmpate(palmeiras);
        saoPaulo.registrarVitoria(saoPaulo);
        Clube.resumoRodada(saoPaulo, palmeiras);

        palmeiras.registrarEmpate(palmeiras);
        saoPaulo.registrarDerrota(saoPaulo);
        Clube.resumoRodada(saoPaulo, palmeiras);

        Clube.resumoTemporada(palmeiras, saoPaulo);
    }
}
