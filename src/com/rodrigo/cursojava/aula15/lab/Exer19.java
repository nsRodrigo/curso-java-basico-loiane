package com.rodrigo.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro numero: ");
        int numero1 = scan.nextInt();

        System.out.print("Entre com a operação (+ - / *): ");
        String operacao = scan.next();

        System.out.print("Entre com o segundo numero: ");
        int numero2 = scan.nextInt();

        double resultado = 0;
        boolean valido = true;

        switch (operacao){
            case "+": resultado = numero1 + numero2;
            break;
            case "-": resultado = numero1 - numero2;
            break;
            case "/": resultado = numero1 / numero2;
            break;
            case "*": resultado = numero1 * numero2;
            break;
            default:
                System.out.println("Operação inválida");
                valido = false;
        }
        if (valido){

            if (resultado <= 0){
                System.out.println(resultado + " é negativo");
            } else {
                System.out.println(resultado + " é positivo");
            }

            if (resultado % 2 == 0){
                System.out.println(resultado + " é par");
            } else {
                System.out.println(resultado + " é impar");
            }
        }

    }
}
