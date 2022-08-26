
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Sorteio {
    public static void main(String[] args) {
        Scanner leitorDeNumero = new Scanner(System.in);
            
        System.out.println("Digite um número de 1 a 100");
        Integer numeroDigitado = leitorDeNumero.nextInt();
        Integer contadorPrimeiraVezSorteado = 1;
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
        String frase = "Seu número não foi sorteado!";
        
        while (numeroDigitado < 1 || numeroDigitado > 100) {            
            System.out.println("Digite um número válido de 1 a 100");
            numeroDigitado = leitorDeNumero.nextInt();
        }
        
        for (int i = 1; i <= 200; i++) {
            if (numeroSorteado == numeroDigitado && contadorPrimeiraVezSorteado
                    == 1) {
                frase = (String.format("A %dª vez que o número "
                + "%d foi sorteado, foi no sorteio de número %d",
                contadorPrimeiraVezSorteado, numeroSorteado, i));
                contadorPrimeiraVezSorteado++;
            }
            
            if (numeroSorteado % 2 == 0) {
                System.out.println(String.format("%d - Número par: %d",i,
                        numeroSorteado));
            } else {
                System.out.println(String.format("%d - Número ímpar: %d",i,
                        numeroSorteado));
            }
            
            numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
        }
        
        System.out.println(frase);
        
    }
}
