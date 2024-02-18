package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer15 {

    @Description(   "Faça um programa que peça os 3 lados de um triangulo. O programa deverá informar se os valores podem ser um triangulo." +
                    "Indique, caso os lados formem um triangulo, se o mesmo é: " +
                        "Equilátero = três lados iguais" +
                        "Isósceles = Quaisquer dois lados iguais" +
                        "Escaleno = Três lados diferentes")

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o lado 1: ");
        int lado1 = scan.nextInt();

        System.out.print("Informe o lado 2: ");
        int lado2 = scan.nextInt();

        System.out.print("Informe o lado 3: ");
        int lado3 = scan.nextInt();

        /**
         * Lógica pra verificar se a soma de qualquer 2 lados é maior que o 3º
         */
        if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1){
        } else {
            System.out.println("Não é um triangulo");
        }

        /**
         * Lógica pra verificar squal o tipo de triangulo de acordo com as medidas informadas
         */
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("Equilátero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Escaleno");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Isóceles");
        }

    }
}
