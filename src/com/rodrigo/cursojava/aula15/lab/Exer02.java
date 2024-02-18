package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer02 {

    @Description("Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número: ");
        int numero = scan.nextInt();

        if (numero >= 0){
            System.out.print("O número " + numero + " é positivo");
        } else {
            System.out.print("O número " + numero + " é positivo");
        }
    }
}
