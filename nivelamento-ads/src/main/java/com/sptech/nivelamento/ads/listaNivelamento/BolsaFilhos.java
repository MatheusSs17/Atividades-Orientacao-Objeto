
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;


public class BolsaFilhos {
    
    public static void main(String[] args) {
        
        Scanner menorQue4 = new Scanner(System.in);
        Scanner menorQue17 = new Scanner(System.in);
        Scanner menorQue19 = new Scanner(System.in);
        
        System.out.println("Digite quantos filhos de 0 a 3 anos você possui: ");
        Integer menorQue4Digitado = menorQue4.nextInt();
        
        System.out.println("Digite quantos filhos de 4 a 16 anos você possui: ");
        Integer menorQue17Digitado = menorQue17.nextInt();
        
        System.out.println("Digite quantos filhos de 17 a 18 anos você possui: ");
        Integer menorQue19Digitado = menorQue19.nextInt();
        
        Double bolsaComAte4Anos = menorQue4Digitado * 25.12;
        Double bolsaComAte17Anos = menorQue17Digitado * 15.88;
        Double bolsaComAte19Anos = menorQue19Digitado * 12.44;
        Double bolsaTotal = bolsaComAte17Anos + bolsaComAte19Anos + 
                bolsaComAte4Anos;
        
        Integer totalDeFilhos = menorQue17Digitado +
                menorQue19Digitado + menorQue4Digitado;
        
        String frase = String.format("Você tem um total de %d filhos"
                + " e vai receber R$%.2f de bolsa", totalDeFilhos, bolsaTotal);
        
        System.out.println(frase);
        
        
    }
    
}

