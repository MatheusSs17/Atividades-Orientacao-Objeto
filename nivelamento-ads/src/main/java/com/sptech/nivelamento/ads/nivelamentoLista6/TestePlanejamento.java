
package com.sptech.nivelamento.ads.nivelamentoLista6;


public class TestePlanejamento {
    public static void main(String[] args) {
        Planejamento pl1 = new Planejamento("Banner", "Dom", 10);
        
        pl1.setDiasUsados(10);
        
        System.out.println(pl1.calcularTempo());
        
        System.out.println(pl1);
    }
}
