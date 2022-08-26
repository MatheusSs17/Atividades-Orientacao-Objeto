
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;


public class SalarioLiquido {
    public static void main(String[] args) {
        
        Scanner salarioBruto = new Scanner(System.in);
        Scanner conducaoDiaria = new Scanner(System.in);
        
        System.out.println("Digite seu salário: ");
        Double salarioBrutoDigitado = salarioBruto.nextDouble();
        
        System.out.println("Digite o valor da passagem de ida da casa"
                + "para o trabalho: ");
        Double conducaoUnicaDigitada = conducaoDiaria.nextDouble();
        Double valeTransporte = conducaoUnicaDigitada * 2 * 22;
        Double desconto = salarioBrutoDigitado * 30
                / 100;
        Double descontoMaisVT = desconto + valeTransporte;
        Double valorLiquido = salarioBrutoDigitado - descontoMaisVT;
        
        String frase = String.format("Seu salário bruto é R$%.2f, tem um total de"
                + " R$%.2f em descontos e receberá um líquido de R$%.2f", 
                salarioBrutoDigitado, descontoMaisVT, valorLiquido);
        
        System.out.println(frase);
        
        
        
        
        
    }
    
}
