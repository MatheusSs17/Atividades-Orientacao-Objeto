
package com.sptech.nivelamento.ads.nivelamentoLista5;

public class TestePokemon {
    
    public static void main(String[] args) {
        TreinadorPokemon atomik = new TreinadorPokemon("Dominciano");
        Pokemon pkm1 = new Pokemon("Excadrill", "Steel", 5.4);
        Pokemon pkm2 = new Pokemon("Pikachu", "Eletric", 3.2);

        atomik.treinarPokemon(pkm1);
        atomik.treinarPokemon(pkm1);
        atomik.treinarPokemon(pkm1);
        atomik.treinarPokemon(pkm1);
        atomik.treinarPokemon(pkm1);
        atomik.treinarPokemon(pkm1);
        

        System.out.println(pkm1);
        atomik.evoluirPokemon(pkm1, "Drilbur");
        System.out.println(pkm1);

        atomik.treinarPokemon(pkm2);
        atomik.treinarPokemon(pkm2);
        System.out.println(pkm2);
        atomik.evoluirPokemon(pkm2, "Raichu");

        System.out.println(atomik);
        
        atomik.treinarPokemon(pkm1);

    }
    
}
