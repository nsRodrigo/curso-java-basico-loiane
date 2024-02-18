package com.rodrigo.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a base: ");
        int base = scan.nextInt();

        System.out.println("Entre com a potencia: ");
        int pot = scan.nextInt();

        int resultado = base;
        for (int i = 1 ; i < pot ; i++){
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}
