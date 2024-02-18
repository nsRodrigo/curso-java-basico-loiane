package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer01 {

    @Description("Faça um programa que peça dois números e imprima o maior deles")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro Numero: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Entre com o segundo Numero: ");
        int segundoNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número é maior: " + primeiroNumero);
        } else {
            System.out.println("O segundo número é maior: " + segundoNumero);
        }
    }
}
