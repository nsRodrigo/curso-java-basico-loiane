package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer07 {

    @Description("Faça um programa que leia 3 números e mostre o maior e o menor deles")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro numero: ");
        int num3 = scan.nextInt();

        /**
         * Lógica para verificar qual dentre 3 numeros informados é o maior
         */
        if (num1 > num2 && num1 > num3){
            System.out.print("O primeiro numero é o maior: " +  num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.print("O segundo numero é o maior: " +  num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.print("O terceiro numero é o maior: " +  num3);
        }

        /**
         * Lógica para verificar qual dentre 3 numeros informados é o menor
         */
        if (num1 < num2 && num1 < num3){
            System.out.print("O primeiro numero é o menor: " +  num1);
        } else if (num2 < num1 && num2 < num3){
            System.out.print("O segundo numero é o menor: " +  num2);
        } else if (num3 < num1 && num3 < num2){
            System.out.print("O terceiro numero é o menor: " +  num3);
        }

    }
}
