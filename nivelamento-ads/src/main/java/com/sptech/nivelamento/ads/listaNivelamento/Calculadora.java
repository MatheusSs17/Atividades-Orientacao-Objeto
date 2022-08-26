
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        
        Scanner primeiroNumero = new Scanner(System.in);
        Scanner segundoNumero = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        Double primeiroNumeroDigitado = primeiroNumero.nextDouble();
        
        System.out.println("Entre com o segundo número: ");
        Double segundoNumeroDigitado = segundoNumero.nextDouble();
        
        Double soma = primeiroNumeroDigitado + segundoNumeroDigitado;
        Double subtracao = primeiroNumeroDigitado - segundoNumeroDigitado;
        Double multiplicacao = primeiroNumeroDigitado * segundoNumeroDigitado;
        Double divisao = primeiroNumeroDigitado / segundoNumeroDigitado;
        
        String frase = String.format("Resultado da soma: \n"
                + "%.1f \nResultado da subtração: \n"
                + "%.1f \nResultado da multiplicação: \n"
                + "%.1f \nResultado da divisão: \n %.1f",
                soma, subtracao, multiplicacao, divisao);
        
        System.out.println(frase);
        
        
    }
    
}
