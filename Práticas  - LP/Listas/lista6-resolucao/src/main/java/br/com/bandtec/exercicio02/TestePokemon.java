package br.com.bandtec.exercicio02;

public class TestePokemon {
    public static void main(String[] args) {

        TreinadorPokemon rafael = new TreinadorPokemon("Rafael");
        TreinadorPokemon celia = new TreinadorPokemon("Celia");

        Pokemon pikachu = new Pokemon("Pikachu", "Eletrico", 10.0);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Aquatico", 5.0);

        rafael.treinarPokemon(pikachu);
        rafael.treinarPokemon(pikachu);
        rafael.treinarPokemon(pikachu);
        rafael.treinarPokemon(pikachu);
        rafael.treinarPokemon(pikachu);

        rafael.evoluirPokemon(pikachu, "Raichu");

        rafael.treinarPokemon(bulbasaur);
        rafael.treinarPokemon(bulbasaur);

        rafael.evoluirPokemon(bulbasaur, "Venusaur");
        System.out.println(rafael.infoTreinador());
        System.out.println(celia.infoTreinador());


    }
}
