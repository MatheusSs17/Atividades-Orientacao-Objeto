
package com.sptech.nivelamento.ads.nivelamentoLista4;


public class TesteEmpregado {
    
    public static void main(String[] args) {
        
        Empregado servidor1 = new Empregado();
        Empregado servidor2 = new Empregado();
        
        servidor1.nome = "João";
        servidor1.salario = 5400.00;
        servidor1.cargo = "Analista de sistemas";
        
        Double porcentagemDoReajuste = 15.0;
        
        servidor1.reajustarSalario(porcentagemDoReajuste);
        
        System.out.println(servidor1.salario);
        
        servidor2.nome = "José";
        servidor2.salario = 100.00;
        servidor2.cargo = "Analista de sistemas";
        
        porcentagemDoReajuste = 100.0;
        
        servidor2.reajustarSalario(porcentagemDoReajuste);
        
        System.out.println(servidor2.salario);
    }
    
}