
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;


public class CalculadoraTroco {
    public static void main(String[] args) {
        
        Scanner valorDoProduto = new Scanner(System.in);
        Scanner quantidadeVendida = new Scanner(System.in);
        Scanner valorPagoPeloCliente = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        Double valorDoProdutoDigitado = valorDoProduto.nextDouble();
        
        System.out.println("Digite a quantidade vendida: ");
        Integer  quantidadeVendidaDigitada = quantidadeVendida.nextInt();
        
        System.out.println("Digite o dinheiro que o cliente deu para pagar: ");
        Double valorPagoPeloClienteDigitada = valorPagoPeloCliente.nextDouble();
        
        Double calculo = valorPagoPeloClienteDigitada - valorDoProdutoDigitado 
                * quantidadeVendidaDigitada;
        
        String troco = String.format("Seu troco será de R$%.2f.", calculo);
        String devendo = String.format("Você está devendo R$%.2f",
                (Math.abs(calculo)));
        
        if (calculo > 0) {
            System.out.println(troco);
        } else if (calculo < 0) {
            System.out.println(devendo);
        } else {
            System.out.println("Você deu o dinheiro exato.");
        } 
    }
    
}
