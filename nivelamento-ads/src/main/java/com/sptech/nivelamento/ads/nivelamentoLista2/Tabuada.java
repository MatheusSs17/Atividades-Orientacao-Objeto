
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;


public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer calculo;
        
        for (int i = 0; i <= 10; i++) {
            calculo = numeroDigitado * i;
            System.out.println(String.format("%d X %d = %d", numeroDigitado,
            i, calculo));
        }
    }
}
