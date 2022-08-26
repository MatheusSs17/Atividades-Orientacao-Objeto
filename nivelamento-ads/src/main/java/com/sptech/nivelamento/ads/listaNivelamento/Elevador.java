
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;


public class Elevador {
    public static void main(String[] args) {
        
        Scanner pesoLimiteDoElevador = new Scanner(System.in);
        Scanner limiteDePessoasNoElevador = new Scanner(System.in);
        Scanner pesoDaPrimeiraPessoa = new Scanner(System.in);
        Scanner pesoDaSegundaPessoa = new Scanner(System.in);
        Scanner pesoDaTerceiraPessoa = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso suportado pelo elevador: ");
        Double pesoLimiteDoElevadorDigitado = pesoLimiteDoElevador.nextDouble();
        
        System.out.println("Digite o limite de pessoas possíveis no elevador:");
        Integer limiteDePessoasNoElevadorDigitado = limiteDePessoasNoElevador
                .nextInt();
        
        System.out.println("Digite o peso da primeira pessoa: ");
        Double pesoDaPrimeiraPessoaDigitado = pesoDaPrimeiraPessoa.nextDouble();
        
        System.out.println("Digite o peso da segunda pessoa: ");
        Double pesoDaSegundaPessoaDigitado = pesoDaSegundaPessoa.nextDouble();
        
        System.out.println("Digite o peso da terceira pessoa: ");
        Double pesoDaTerceiraPessoaDigitado = pesoDaTerceiraPessoa.nextDouble();
        
        Double pesoTotal = pesoDaPrimeiraPessoaDigitado +
                pesoDaSegundaPessoaDigitado + pesoDaTerceiraPessoaDigitado;
        
        String frase = String.format("Entraram 3 pessoas no elevador, "
                + "no qual cabem %d pessoas. \n\n"
                + "O peso total no elevador é de %.2f Kg, sendo que ele "
                + "suporta %.2fKg", limiteDePessoasNoElevadorDigitado,
                pesoTotal, pesoLimiteDoElevadorDigitado);
        
        System.out.println(frase);
        
        
        
    }
    
}
