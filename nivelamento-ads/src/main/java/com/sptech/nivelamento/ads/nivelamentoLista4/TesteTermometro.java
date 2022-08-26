
package com.sptech.nivelamento.ads.nivelamentoLista4;


public class TesteTermometro {
    
    public static void main(String[] args) {
        
        Termometro term1 = new Termometro(1.0,1.0,1.0 );
        
        term1.aumentaTemperatura(1.2);
        
        System.out.println(term1);
        
        term1.diminuiTemperatura(3.9);
        
        System.out.println(term1);
        
        term1.aumentaTemperatura(2.0);
        
        System.out.println(term1);
        
    }
    
    
}
