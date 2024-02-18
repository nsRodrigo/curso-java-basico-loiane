package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer04 {

    @Description("Faça um programa que identidique se a letra digitada é vogal ou consoante")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com uma letra: ");
        String letra = scan.next();

        /**
         * Lógica criada para verificar se foi digitada mais de uma letra
         */
        if (letra.length() > 1) {
            System.out.println(letra + " não é uma letra");
        } else {
            /**
             * Lógica para identificar se a letra digitada é vogal ou consoante com o IfElse
             */
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                System.out.println("A letra " + letra + " é uma vogal");
            } else {
                System.out.println("A letra " + letra + " é uma consoante");
            }
        }

        /**
         * Lógica criada para verificar se foi digitada mais de uma letra
         */
        if (letra.length() > 1){
            System.out.println(letra + " não é uma letra");
        } else {
            /**
             * Lógica para identificar se a letra digitada é vogal ou consoante com o switch
             */
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("A letra " + letra + " é uma vogal");
                    break;
                default:
                    System.out.println("A letra " + letra + " é uma consoante");
            }
        }
    }
}
