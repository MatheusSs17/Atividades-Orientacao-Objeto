
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;

public class PizzaFavorita {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado = null;
        Integer contadorMussarela = 0;
        Integer contador4Queijos = 0;
        Integer contadorCalabresa = 0;
        int i = 1;
        
            while (i < 10) {
                System.out.println("Digite 5 para votar na pizza de Mussarela\n"
                        + "Digite 25 para votar na pizza de Quatro Queijos\n"
                        + "Digite 50 para votar na pizza de Calabresa: ");
                numeroDigitado = leitor.nextInt();
            switch (numeroDigitado) {
                case 5:
                    contadorMussarela++;
                    System.out.println("Você votou na pizza de Mussarela!\n");
                    i++;
                    
                    break;
                case 25:
                    contador4Queijos++;
                     System.out.println("Você votou na pizza de"
                             + " Quatro Queijos!\n");
                    i++;
                    break;
                case 50:
                    contadorCalabresa++;
                     System.out.println("Você votou na pizza de Calabresa!\n");
                    i++;
                    break;
                default:
                    System.out.println("Entre com um número válido "
                        + "por favor... \n");
                    break;
            }   
        }
            System.out.println(String.format("Você votou na pizza de"
                        + " mussarela %d vezes.\n Na de quatro queijos "
                        + "%d vezes.\n E na de calabresa %d vezes", 
                        contadorMussarela, contador4Queijos, contadorCalabresa)
                        );
    }
}
