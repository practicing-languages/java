package br.com.bandtec.exercicio02;

public class TreinadorPokemon {
    private String nome;
    private Integer nivel = 0;

    public String infoTreinador() {
        return "TreinadorPokemon{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    public TreinadorPokemon(String nome) {
        this.nome = nome;
        System.out.println(infoTreinador());
    }

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() + pokemon.getForca() * 0.10);
        pokemon.setDoces(pokemon.getDoces() + 10);

        this.setNivel(this.nivel + 2);
        System.out.println(String.format("%s Força: %.2f Doces: %d ", pokemon.getNome(), pokemon.getForca(), pokemon.getDoces()));
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao) {
        if (pokemon.getDoces() >= 50) {
            System.out.println("Pokemon " + pokemon.getNome() + " evoluiu para -> " + nomeEvolucao);
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            this.setNivel(this.getNivel() + 10);
            System.out.println(pokemon.infoPokemon());

        } else {
            System.out.println("Não foi possível realizar a evolução!");
        }
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
