
package com.sptech.nivelamento.ads.nivelamentoLista4;

public class Bolo {
    
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    
    void comprarBolo(Integer quantidadeVendida) {
        
        if (quantidadeVendida > 100) {
            
            String frase = "Seu pedido"
                    + " ultrapassou nosso limite diário para esse bolo.";
            System.out.println(frase);
            
        } else {
            
            this.quantidadeVendida = quantidadeVendida;
            
        }
    }
    
    void exibirRelatorio(String sabor, Double valor, Integer quantidadeVendida){
        
        if (quantidadeVendida <= 100) {
        String frase = String.format("O bolo sabor %s, foi comprado %d"
                + " vezes hoje, totalizando R$%.2f",
                sabor, quantidadeVendida, valor * quantidadeVendida);
        System.out.println(frase);
        }
        
    }
    
}
