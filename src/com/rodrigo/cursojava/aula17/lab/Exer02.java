package com.rodrigo.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do {

            System.out.println("Entre com o nome do usuário: ");
            nomeUser = scan.next();

            System.out.println("Entre com a senha: ");
            senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                infoValidas = false;
                System.out.println("Senha igual ao usuário, digite novamente");
            } else {
                infoValidas = true;
                System.out.println("Usuário e senha válidos");
            }

        } while (!infoValidas);
    }
}
