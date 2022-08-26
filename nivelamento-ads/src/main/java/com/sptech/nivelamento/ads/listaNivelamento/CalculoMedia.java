
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;


public class CalculoMedia {
    public static void main(String[] args) {
        
        Scanner nomeDoUsuario = new Scanner(System.in);
        Scanner notaUm = new Scanner(System.in);
        Scanner notaDois = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeDoUsuarioDigitado = nomeDoUsuario.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        Double notaUmDigitada = notaUm.nextDouble();
       
        System.out.println("Digite a segunda nota: ");
        Double notaDoisDigitada = notaDois.nextDouble();
        
        Double mediaDasNotas = (notaUmDigitada + notaDoisDigitada) / 2;
                
        
        String frase = String.format("Olá, %s. Sua média foi de %.1f!", 
                nomeDoUsuarioDigitado, mediaDasNotas);
        
        System.out.println(frase);
    }
    
}
