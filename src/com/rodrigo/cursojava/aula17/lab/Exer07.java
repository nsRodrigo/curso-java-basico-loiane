package com.rodrigo.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = 0;
        int maior = Integer.MIN_VALUE;

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Entre com um número: ");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
                System.out.println("O numero maior mudou: " + maior);
            }
        }
        System.out.println("Maior numero: " + num);
    }
}
