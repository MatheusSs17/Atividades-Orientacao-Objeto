
package com.sptech.nivelamento.ads.nivelamentoLista2;

public class NumerosPares {
    public static void main(String[] args) {
        
        int i = 0;
        while (i <= 40) {
            if (i % 2 == 0) {
                System.out.println(String.format("Número par: %d", i ));
            }
            i++;
        }
    }
    
}
