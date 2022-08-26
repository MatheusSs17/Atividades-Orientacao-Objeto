
package com.sptech.nivelamento.ads.nivelamentoLista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaFrutas {
    private List<String> listaFrutas;
    public void verificarFruta(String frutaDigitada){
        listaFrutas = new ArrayList<String>();
        
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Morango");
        listaFrutas.add("Limão");

                if (listaFrutas.contains(frutaDigitada)) {
                    System.out.println("Acertou");
                } else {
                    System.out.println("Tente novamente!");
                }
    }

    public List<String> getListaFrutas() {
        return listaFrutas;
    }

    public void setListaFrutas(List<String> listaFrutas) {
        this.listaFrutas = listaFrutas;
    }
    
    
}

//Crie um Programa em Java no qual:
//a) Tenha uma lista de frutas a qual o usuário não vê
//b) Tenha uma tela (JFrame) na qual o usuário digita o nome da fruta e um botão "Pesquisar"
//c) Ao clicar nesse botâo, o programa busca essa fruta na lista (essa busca diferencia maiúsculas e minúsculas).
//Se achar, exibe um texto abaixo com uma frase como esta:
//A fruta X existe na lista.
//d) Caso a fruta pesquisada não exista, exiba:
//Não existe a fruta X na lista.
