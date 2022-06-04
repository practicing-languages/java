package br.com.bandtec.exercicio02;

public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces = 0;

    public String infoPokemon() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", forca='" + forca + '\'' +
                ", doces=" + doces +
                '}';
    }

    public Pokemon(String nome, String tipo, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;

        System.out.println(infoPokemon());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }
}
