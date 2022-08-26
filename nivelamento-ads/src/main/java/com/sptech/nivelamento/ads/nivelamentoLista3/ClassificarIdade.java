
package com.sptech.nivelamento.ads.nivelamentoLista3;

import java.util.Scanner;


public class ClassificarIdade {
    public static void main(String[] args) {
        
        Scanner leitorIdade = new Scanner(System.in);
        Utilitario util = new Utilitario();
        
        System.out.println("Entre com sua idade: ");
        Integer idadeDigitada = leitorIdade.nextInt();
        
        util.classificarIdade(idadeDigitada);
    }
}
