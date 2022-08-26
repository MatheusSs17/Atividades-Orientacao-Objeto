
package com.sptech.nivelamentoAds;

import java.util.Scanner;


public class Condicionais {
    
    public static void main(String[] args) {
        
        Scanner numeroBom = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
         
        Integer numero = 42;
        
        
        System.out.println("Digita um numero ai meu bom:  ");
        Integer numeroBomDigitado = numeroBom.nextInt();
        //IF 
        if (numeroBomDigitado > numero) {
            System.out.println("Grande neh? meu pé");
        } else if ( numeroBomDigitado < numero) {
            System.out.println("Pequeno neh?? rsrs");
        } else {
            System.out.println("igual neh po" + numeroBomDigitado);
        }
            
        
        String nome1 = "Matheus";
        System.out.println("Coloca o nome Mathes ai po");
        String nome2 = leitor.nextLine();
        Boolean ligado = true;
        Boolean nome3 = nome1.equals(nome2);
        
        if (ligado) {
            System.out.println("Ligado");
        } else {
            System.out.println("Desligado");
        }
        
        if (nome1.equals(nome2) && ligado) { // == são os 3 iguais no Js;
            System.out.println("Os nomes são iguais");
        } else {
            System.out.println("São diferentes neh po");
        }
        
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("igual mesmo tendo maiusculo, minusculo e bla bla");
        } else {
            System.out.println("reprovado");
        }
    }
    
}
