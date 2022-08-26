package com.sptech.nivelamento.ads.nivelamentoLista4;

public class App {
    
    public static void main(String[] args) {
        
    Bolo venda1 = new Bolo();
    Bolo venda2 = new Bolo();
    Bolo venda3 = new Bolo();
    
    venda1.sabor = "Chocolate";
    venda1.valor = 20.00;
    venda1.quantidadeVendida = 101;
    
    venda2.sabor = "Abacaxi";
    venda2.valor = 25.00;
    venda2.quantidadeVendida = 50;
    
    venda3.sabor = "Morango";
    venda3.valor = 30.00;
    venda3.quantidadeVendida = 20;
    
    venda1.comprarBolo(venda1.quantidadeVendida);
    venda2.comprarBolo(venda2.quantidadeVendida);
    venda3.comprarBolo(venda3.quantidadeVendida);
    
    venda1.exibirRelatorio(venda1.sabor, venda1.valor, venda1.quantidadeVendida);
    venda2.exibirRelatorio(venda2.sabor, venda2.valor, venda2.quantidadeVendida);
    venda3.exibirRelatorio(venda3.sabor, venda3.valor, venda3.quantidadeVendida);
    
    }
    
}
