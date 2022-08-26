
package com.sptech.nivelamento.ads.nivelamentoLista3;

import java.util.Objects;
import java.util.Scanner;


public class Utilitario {
    
    Double calcularMedia(Double notaUm, Double notaDois) {
        Double media = (notaUm * 0.4)  + (notaDois * 0.6);
        return media;
    }
    
    Double verificarSalarioMinimo(Double rendaFamiliar) {
        Double calculoSalarioMinimo = rendaFamiliar / 1100.00;
        return calculoSalarioMinimo;
    }
    
    String verificarClasse(Double rendaFamiliar){
        String classeSocial = null;
        
        if (rendaFamiliar < 0) {
             classeSocial = "Devedor de agiota";
             
        } else if (rendaFamiliar <= 2) {
            classeSocial = "E";
            
        } else if (rendaFamiliar <= 4) {
            classeSocial = "D";
            
        } else if (rendaFamiliar <= 10) {
            classeSocial = "C";
            
        } else if (rendaFamiliar <= 20) {
            classeSocial = "B";
            
        } else if (rendaFamiliar > 20) {
            classeSocial = "A";
            
        } 
        return classeSocial;
    }
    
    void classificarIdade(Integer idade) {
        String faixaEtaria = null;
        if (idade < 0) {
            faixaEtaria = "Ta pra nascer ainda?";
            
        } else if (idade <= 2) {
            faixaEtaria = "Bebê";
            
        } else if (idade <= 11) {
            faixaEtaria = "Criança";
            
        } else if (idade <= 19) {
            faixaEtaria = "Adolescente";
            
        } else if (idade <= 30) {
            faixaEtaria = "Jovem";
            
        } else if (idade <= 60) {
            faixaEtaria = "Adulto";
            
        } else if (idade > 60) {
           faixaEtaria = "Idoso";
        }
        System.out.println(faixaEtaria);
    }
    
    Double calcularDesconto(Double valorDoProduto, Integer quantidadeDoProduto) {
        Double calculo = null;
        switch (quantidadeDoProduto) {
            case 0:
                calculo = valorDoProduto * 0;
                break;
            case 1:
                calculo = valorDoProduto * 0.9;
                break;
            case 2:
                calculo = (valorDoProduto * quantidadeDoProduto) * 0.8;
                break;
            default:
                calculo = (valorDoProduto * quantidadeDoProduto) * 0.7;
                break;
        }
        return calculo;
    }
    
    String exibirNotaFiscal(Double valorDoProduto, Integer quantidadeDoProduto,
            Double calculo) {
        String frase = String.format("=".repeat(60)
                + "\n\nValor do produto:\tR$%.2f"
                + "\nQuantidade de produtos: %d \n\n" + "=".repeat(60) +
                "\n\nValor com desconto: R$%.2f",
                valorDoProduto, quantidadeDoProduto, calculo);
        return frase;
    }
    
    void calculaPesoIdeal(String genero, Double altura) {
        
        if (Objects.equals(genero.toUpperCase(), "M")) {
            System.out.println(String.format("Seu peso ideal é %.2f Kilos",
                    (72.7 * altura) - 58));
        } else if (Objects.equals(genero.toUpperCase(), "F")) {
            System.out.println(String.format("Seu peso ideal é %.2f Kilos",
                    (62.1 * altura) - 44.7));
            }
    }
    
    
    
}

//Crie uma classe Java e escreva um método chamado verificarPrimo,
//que recebe um número inteiro e exibe se esse número é ou não primo 
//        (Dica: para saber se o número é primo, veja quantos divisores 
//                o número tem, ou seja, verifique se ele é divisível por
//                        1, por 2, por 3, etc. até ele próprio, e conte quantos
//                                divisores são. Se o número de divisores for 2,
//então ele é primo.) Escreva o método main que solicita que o usuário digite
//        vários valores positivos e chame o método verificaPrimo para 
//                exibir se o número lido é primo ou não. O programa deve encerrar
//                        quando o usuário digitar um valor negativo. 