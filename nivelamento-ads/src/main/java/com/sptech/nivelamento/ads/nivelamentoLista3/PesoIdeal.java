
package com.sptech.nivelamento.ads.nivelamentoLista3;

import java.util.Scanner;


public class PesoIdeal {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Utilitario util = new Utilitario();
        
        String sexoDigitado = null;
    
        do {            
            System.out.println("Digite seu sexo (M ou F): ");
            sexoDigitado = leitor.nextLine();
        } while (!"F".equals(sexoDigitado.toUpperCase()) && 
                !"M".equals(sexoDigitado.toUpperCase()));
        
        System.out.println("Digite sua altura: ");
        Double alturaDigitada = leitor.nextDouble();
        
        util.calculaPesoIdeal(sexoDigitado, alturaDigitada);
    }
    
}
