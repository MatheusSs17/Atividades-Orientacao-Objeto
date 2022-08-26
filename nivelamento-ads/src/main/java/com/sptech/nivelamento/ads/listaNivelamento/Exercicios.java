
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        
        Scanner minutosDeAquecimento = new Scanner(System.in);
        Scanner minutosDeAerobicos = new Scanner(System.in);
        Scanner minutosDeMusculacao = new Scanner(System.in);
        
        System.out.println("Digite quantos minutos você ficou se aquecendo"
                + " (Apenas números inteiros): ");
        Integer minutosDeAquecimentoDigitado = minutosDeAquecimento.nextInt();
        
        System.out.println("Digite quantos minutos você ficou fazendo"
                + " exercícios aeróbicos (Apenas números inteiros): ");
        Integer minutosDeAerobicosDigitado = minutosDeAerobicos.nextInt();
        
        System.out.println("Digite quantos minutos você ficou fazendo"
                + " musculação (Apenas números inteiros): ");
        Integer minutosDeMusculacaoDigitado = minutosDeMusculacao.nextInt();
        
        
        Integer caloriasPerdidasNoAquecimento = minutosDeAquecimentoDigitado
                * 12;
        Integer caloriasPerdidasNaAerobica = minutosDeAerobicosDigitado
                * 20;
        Integer caloriasPerdidasNaMusculacao = minutosDeMusculacaoDigitado
                * 25;
        
        
        Integer totalDeMinutosSeExercitando = minutosDeAerobicosDigitado +
                minutosDeAquecimentoDigitado + minutosDeMusculacaoDigitado;
        Integer totalDeCaloriasPerdidas = caloriasPerdidasNaAerobica +
                caloriasPerdidasNaMusculacao + caloriasPerdidasNoAquecimento;
        
        String frase = String.format("Olá Jorge. Você fez um total de %d minutos"
                + " de exercícios e perdeu cerca de %d calorias.", 
                totalDeMinutosSeExercitando, totalDeCaloriasPerdidas);
        System.out.println(frase);
        
        
        
    }
    
}
