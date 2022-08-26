
package com.sptech.nivelamento.ads.nivelamentoLista3;

import java.util.Scanner;


public class ClassesSociais {
    
    public static void main(String[] args) {
        Utilitario util = new Utilitario();
        Scanner leitorRenda = new Scanner(System.in);
        
        System.out.println("Entre com sua renda familiar mensal: ");
        Double rendaDigitada = leitorRenda.nextDouble();
        
        Double salarioMinimo = util.verificarSalarioMinimo(rendaDigitada);
        String classeSocial = util.verificarClasse(salarioMinimo);
          
        String frase = String.format("Você recebe aproximandamente %.1f Salários"
                + "Mínimos \n"
                + "Você pertence a classe social: %s",
                salarioMinimo, classeSocial);
        
        System.out.println(frase);
    }
    
    
}
