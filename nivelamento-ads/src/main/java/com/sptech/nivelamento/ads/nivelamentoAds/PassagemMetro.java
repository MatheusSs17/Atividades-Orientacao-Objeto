
package com.sptech.nivelamentoAds;

import java.util.Scanner;


public class PassagemMetro {
    public static void main(String[] args) {
        
        Scanner saldoDigitado = new Scanner(System.in);
        Scanner nomeDigitado = new Scanner(System.in);
        
        
        System.out.println("Entre com seu nome: ");
        String usuario = nomeDigitado.nextLine();
        
        
        System.out.println("Entre com seu dinheiro: ");
        Double saldo = saldoDigitado.nextDouble();
        
        
        Double cota = 4.40;
        Double vezesQuePodeUsar = saldo / cota;
        Integer desconto = 50;
        
        String frase = String.format("Olá %s, você ainda pode usar o metro %.0f "
                + "vezes"
            , usuario, vezesQuePodeUsar);

        System.out.println(frase);
        
        
        System.out.println(String.format("Você tem %d%% de desconto", desconto));
    }
    
}
