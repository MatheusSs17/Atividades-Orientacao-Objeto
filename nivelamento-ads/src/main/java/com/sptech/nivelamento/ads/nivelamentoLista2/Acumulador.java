
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer soma = numeroDigitado;
        while (soma < 1000 && numeroDigitado != 0) {            
            System.out.println("Digite mais um número: ");
            numeroDigitado = leitor.nextInt();
            soma += numeroDigitado;
        }
        System.out.println(String.format("A soma dos números é %d", soma));
    }
    
}
