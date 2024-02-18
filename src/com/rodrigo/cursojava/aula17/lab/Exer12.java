package com.rodrigo.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero para gerar a tabuada: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
