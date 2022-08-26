
package com.sptech.nivelamento.ads.nivelamentoLista8;


public class AppLoja {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Uva", "Fruta", 5.5);
        Produto p2 = new Produto("Abacaxi", "Fruta", 12.79);
        Produto p3 =  new Produto("Pimenta", "Especiaria", 8.35);
        
        Carrinho c1 = new Carrinho("Dom");
        
        
        
        c1.adicionar(p1);
        c1.adicionar(p2);
        c1.adicionar(p3);
        
        System.out.println(c1.existsPorNome("uva"));
        
        System.out.println(c1.getQuantidade());
        
        System.out.println(c1.getValorTotal());
        
        c1.removerPorNome("Pimenta");
        
        System.out.println(c1.getQuantidadePorCategoria("Especiaria"));
        
       
        
        
        
        
        
    }
}
