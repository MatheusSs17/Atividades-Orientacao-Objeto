
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Potencia {
    
    public static void main(String[] args) {
        
        Scanner leitorExpoente = new Scanner(System.in);
        Scanner leitorBase = new Scanner(System.in);
        //Integer numeroGeradoBase = ThreadLocalRandom.current().nextInt(1, 101);
       
        System.out.println("Digite o número base: ");
        Integer numeroDigitadoBase = leitorBase.nextInt();
        Integer multiplicador = numeroDigitadoBase;
        
        //Integer numeroGeradoExpoente = ThreadLocalRandom.current().nextInt(1, 6);
        //Integer numero = 2;
        System.out.println("Digite o número expoente: ");
        Integer numeroDigitadoExpoente = leitorExpoente.nextInt();
        
        for (int i = 1; i <= numeroDigitadoExpoente; i++) {
//            numero = numero * 2;
//            System.out.println(numeroGeradoBase);
              System.out.println(numeroDigitadoBase + "\n\n");
              numeroDigitadoBase = numeroDigitadoBase * multiplicador;
        }
        System.out.println(numeroDigitadoBase);
    }
    
   
    
}
