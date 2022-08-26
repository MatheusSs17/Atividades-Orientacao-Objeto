
package com.sptech.nivelamento.ads.nivelamentoLista5;


public class TesteColaborador {
        
    public static void main(String[] args) {
        Colaborador c1 = new Colaborador("Dominciano", "Garoto de Programa");
        Colaborador c2 = new Colaborador("Dom", "Dev", 10000.0);
        RecursosHumanos rh1 = new RecursosHumanos();
        
        System.out.println(c1);
        System.out.println(c2);
        
        rh1.promoverColaborador(c2, "Senior", 1000.0);
        rh1.promoverColaborador(c2, "Senior", 100000.0);
        rh1.reajustarSalario(c2, 12312.2);
        
        System.out.println(rh1);
    }
    
}
