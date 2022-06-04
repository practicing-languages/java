package br.com.bandtec.exercicio02;

public class Clube {
    private String time;
    private Integer vitoria = 0;
    private Integer empate = 0;
    private Integer derrota = 0;
    private Integer pontos = 0;
    private static Integer numeroRodada = 0;

    public Clube(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Clube{" +
                "time='" + time + '\'' +
                ", vitoria=" + vitoria +
                ", empate=" + empate +
                ", derrota=" + derrota +
                ", pontos=" + pontos +
                '}';
    }

    public static void comecoTemporada() {
        if (numeroRodada == 0) {
            System.out.println("Começa a temporada!");
            numeroRodada++;
        }

    }

    public void registrarVitoria(Clube clube) {
        comecoTemporada();
        this.vitoria++;
        this.pontos += 3;
        System.out.println(String.format("%s ganhou nessa rodada!", this.getTime()));
    }

    public void registrarEmpate(Clube clube) {
        comecoTemporada();
        this.empate++;
        this.pontos++;
        System.out.println(String.format("%s empatou nessa rodada!", this.getTime()));

    }

    public void registrarDerrota(Clube clube) {
        comecoTemporada();
        derrota++;
        System.out.println(String.format("%s perdeu nessa rodada!", this.getTime()));

    }

    public static void resumoRodada(Clube clube1, Clube clube2) {
        System.out.println(String.format("%S pontos: %d", clube1.getTime(), clube1.pontos));
        System.out.println(String.format("%S pontos: %d", clube2.getTime(), clube2.pontos));
        System.out.println("____________________________________");
    }

    public static void resumoTemporada(Clube clube1, Clube clube2) {
        System.out.println("Final de temporada!");

        System.out.println(String.format("%s: %d vitórias, %d empates, %d derrotas\n" +
                        "Total de pontos: %d\n \n" +
                        "%s: %d vitórias, %d empates, %d derrotas\n" +
                        "Total de pontos: %d", clube1.getTime(), clube1.getVitoria(), clube1.getEmpate(), clube1.getDerrota(), clube1.getPontos(),
                clube2.getTime(), clube2.getVitoria(), clube2.getEmpate(), clube2.getDerrota(), clube2.getPontos()));
    }

    public Integer getPontos() {
        return pontos;
    }

    public Integer getEmpate() {
        return empate;
    }

    public Integer getDerrota() {
        return derrota;
    }

    public Integer getVitoria() {
        return vitoria;
    }

    public String getTime() {
        return time;
    }

}
