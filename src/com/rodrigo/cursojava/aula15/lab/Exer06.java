package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer06 {

    @Description("Faça um programa que leia 3 números e leia o maior deles")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.print("Informe o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.print("Informe o terceiro numero: ");
        int num3 = scan.nextInt();

        /**
         * Lógica para verificar qual dentre 3 numeros informados é o maior
         */
        if (num1 > num2 && num1 > num3){
            System.out.print("O primeiro numero é maior: " +  num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.print("O segundo numero é o maior: " +  num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.print("O terceiro numero é o maior: " +  num3);
        }
    }
}
