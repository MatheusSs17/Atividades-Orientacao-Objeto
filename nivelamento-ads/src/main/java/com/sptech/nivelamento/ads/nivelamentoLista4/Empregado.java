
package com.sptech.nivelamento.ads.nivelamentoLista4;


public class Empregado {
    
    String nome;
    String cargo;
    Double salario = 1000.0;
    
    void reajustarSalario(Double porcentagemDoReajuste){
        
        salario = salario + (salario * porcentagemDoReajuste / 100);
    }
    
}
