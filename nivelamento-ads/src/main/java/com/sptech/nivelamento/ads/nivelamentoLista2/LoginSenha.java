
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;

public class LoginSenha {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        Scanner senha = new Scanner(System.in);
        
        System.out.println("Digite o login: ");
        String loginDigitado = login.nextLine();
        
        System.out.println("Digite a senha: ");
        String senhaDigitada = senha.nextLine();
        
        while (!"admin".equals(loginDigitado) || !"#Bandtec".equals(senhaDigitada)) {            
            System.out.println("Login ou senha errada... Tente novamente...");
            System.out.println("Digite o login novamente: ");
            loginDigitado = login.nextLine();
            System.out.println("Digite a senha novamente: ");
            senhaDigitada = senha.nextLine();
        }
        System.out.println("Login afetuado com sucesso");
    }
    
}
