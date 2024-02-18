package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer03 {

    @Description("Faça um programa que verifique se uma letra difitada é 'F' ou 'M'. " +
                 "Conforme a letra que escrever: F = Feminino | M = Masculino | Sexo Inválido")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o sexo (entre com F ou M): ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
