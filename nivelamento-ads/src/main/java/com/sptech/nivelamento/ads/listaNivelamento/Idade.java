
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        
        Scanner nomeDoUsuario = new Scanner(System.in);
        Scanner anoDeNascimentoDoUsuario = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        
        
//        System.out.println("Digite seu nome: ");
//        String nomeDoUsuarioDigitado = nomeDoUsuario.nextLine();
//        
//        System.out.println(String.format("Olá, %s! Qual o ano de seu"
//                + " nascimento?", nomeDoUsuarioDigitado));
//        Integer anoDeNascimentoDoUsuarioDigitada = 
//                anoDeNascimentoDoUsuario.nextInt();
        
        Date anoAtual = calendario.getTime();
        System.out.println(anoAtual);
        //Integer idadeAtual = anoAtual - anoDeNascimentoDoUsuarioDigitada;
       // Integer idadeEm2030 = 2030 - anoDeNascimentoDoUsuarioDigitada;
        
//        System.out.println(String.format("Você tem %d anos e em 2030 você terá"
//                + " %d anos.", idadeAtual, idadeEm2030)); 
    }
    
}
