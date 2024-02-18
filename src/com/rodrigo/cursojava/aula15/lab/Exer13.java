package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer13 {

    @Description(   "Faça um programa que leia um número e exiba o dia correspondente da semana:" +
                    "1 - Domingo" +
                    "2 - Segunda" +
                    "3 - Terça" +
                    "4 - Quarta" +
                    "5 - Quinta" +
                    "6 - Sexta" +
                    "7 - Sabádo" +
                    "Se digitar outro valor, deve aparecer numero inválido")

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número correspondente ao dia da semana: ");
        int diaSemana = scan.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Valor Inválido");

        }
    }
}
