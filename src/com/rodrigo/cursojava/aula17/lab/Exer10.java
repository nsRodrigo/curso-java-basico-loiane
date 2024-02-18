package com.rodrigo.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        for (int i = num1 ; i <= num2 ; i++){
            System.out.println(i);
        }
    }
}
