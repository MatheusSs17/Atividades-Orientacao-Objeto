
package com.sptech.nivelamento.ads.nivelamentoLista3;

import java.util.Scanner;


public class NotasEscola {
    public static void main(String[] args) {
        Utilitario util = new Utilitario();
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Entre com a primeira nota: ");
        Double notaUmDigitada = leitorNumero.nextDouble();
        
        System.out.println("Entre com a segunda nota: ");
        Double notaDoisDigitada = leitorNumero.nextDouble();
        
        Double media = util.calcularMedia(notaUmDigitada, notaDoisDigitada);
        String frase = String.format("Sua média foi de %.2f", 
                media);
        
        System.out.println(frase);
        
    }
}
