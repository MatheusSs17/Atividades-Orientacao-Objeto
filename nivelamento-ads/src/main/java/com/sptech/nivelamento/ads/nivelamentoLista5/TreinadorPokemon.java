
package com.sptech.nivelamento.ads.nivelamentoLista5;


public class TreinadorPokemon {
    
    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome) {
        this.setNome(nome);
        this.setNivel(1);
    }
    
    void treinarPokemon(Pokemon pokemon){
        
        pokemon.setForca(pokemon.getForca() + (pokemon.getForca() * 10 / 100)); 
        pokemon.setDoces(pokemon.getDoces() + 10);
        this.setNivel(this.getNivel() + 2);
    }
    
    void evoluirPokemon(Pokemon pokemon,
            String nomeEvolucao){
        
        System.out.println("Tentando evoluir " + pokemon.getNome());
        String frase;
        String nomeAnterior = pokemon.getNome();
        
        if (pokemon.getDoces() >= 50) {
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            this.setNivel(this.getNivel() + 10);
            frase = String.format("O Pokemon %s evoluiu"
                    + " para %s \n\n", nomeAnterior, nomeEvolucao);
            
            
        } else {
            
            frase = "Não foi possível realizar a operação\n\n";
            
        }
        
        System.out.println(frase);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        String frase = String.format
        ("Informações do Treinador\n\nNome: %s\t|Nível: %d\n\n\n",
                nome, nivel);
        return frase;
    }
    
}



