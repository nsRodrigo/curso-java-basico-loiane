package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer09 {

    @Description("Faça um programa que peça 3 número e mostre-os em ordem decrescente")
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int num3 = scan.nextInt();

        /**
         * Lógica para mestrar números em ordem decrescente
         */
        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            System.out.println(num3 + " - " + num2 + " - " + num1);
            /* num1 < num2 < num3
             * num1 é menor que todos
             * num3 é maior que todos
             */
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            System.out.println(num2 + " - " + num3 + " - " + num1);
            /* num1 < num3 < num2
             * num1 é menor que todos
             * num2 é maior que todos
             */
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            System.out.println(num3 + " - " + num1 + " - " + num2);
            /* num2 < num3 < num1
             * num2 é menor que todos
             * num3 é maior que todos
             */
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
            System.out.println(num1 + " - " + num3 + " - " + num2);
            /* num2 < num3 < num1
             * num2 é menor que todos
             * num1 é maior que todos
             */
        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
            System.out.println(num2 + " - " + num1 + " - " + num3);
            /* num3 < num1 < num2
             * num3 é menor que todos
             * num2 é maior que todos
             */
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
            System.out.println(num1 + " - " + num2 + " - " + num3);
            /* num3 < num2 < num1
             * num3 é menor que todos
             * num1 é maior que todos
             */
        }
    }
}
