
package com.sptech.nivelamentoAds;


public class Interpolacao {
    public static void main(String[] args) {
        String nome = "転生したらスライムだった件";
        Integer idade = 30;
        Double altura = 1.65;
        
        //Apresentação 
        System.out.println("転生したらスライムだった件 " +nome+ ", 転生したらスライムだった件 "
                +idade+ " 転生したらスライムだった件 " +altura+ " 転生したらスライムだった件");
        
        //Interpolação 
        //${nome} não funfa no java
        
        System.out.println
        (String.format("Meu nome é %s, tenho %d anos, e %2f de altura",
                nome, idade, altura));
        
       // String frase = (String.format("Meu nome é %s, tenho %d anos, e %2f de altura",
       //       nome, idade, altura);
    }
    
}
