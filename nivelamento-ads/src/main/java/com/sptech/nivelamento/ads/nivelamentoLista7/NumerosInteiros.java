
package com.sptech.nivelamento.ads.nivelamentoLista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NumerosInteiros {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<Integer>();
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado = null;
        Integer soma = 0; 
        Integer menor = 9999;
        Integer maior = 0;
        
        do {            
            numeroDigitado = leitor.nextInt();
            listaInteiros.add(numeroDigitado);
        } while (numeroDigitado != 0);
        
        listaInteiros.remove(listaInteiros.size() - 1);
        
        System.out.println("Pares\n-------------------------------------------");
        for (Integer listaInteiro : listaInteiros) {
            if (listaInteiro % 2 == 0) {
                System.out.println(listaInteiro);
            }
        }
        System.out.println("\n\n");
        System.out.println("Impares\n-------------------------------------------");
        for (Integer listaInteiro : listaInteiros) {
            if (listaInteiro % 2 != 0) {
                System.out.println(listaInteiro);
            }
        }
        System.out.println("\n\nSoma\n-------------------------------------------");
        for (Integer listaInteiro : listaInteiros) {
            soma += listaInteiro;
        }
        System.out.println(soma);
        
        for (Integer listaInteiro : listaInteiros) {
            if (listaInteiro < menor) {
                menor = listaInteiro;
            }
            if (listaInteiro > maior) {
                maior = listaInteiro;
            }
        }
        System.out.println("\n\nMenor\n-------------------------------------------");
        System.out.println(menor);
        System.out.println("\n\nMaior\n-------------------------------------------");
        System.out.println(maior);
    }
}

//Crie um programa em Java no qual:
//a) Solicite ao usuário que digite números inteiros e os adicione em uma lista.
//Somente pare de perguntar um novo número listaInteirosquando o usuário digitar 0.
//b) Exiba somente os pares da lista.
//c) Exiba somente os ímpares da lista.
//d) Exiba a soma de todos os números da lista.
//e) Exiba somente o menor número da lista.
//f) Exiba somente o maior número da lista.
