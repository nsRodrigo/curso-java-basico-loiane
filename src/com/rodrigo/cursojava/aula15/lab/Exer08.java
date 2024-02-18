package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Formatter;
import java.util.Scanner;

public class Exer08 {

    @Description(   "Faça um programa que pergunte o preço de três produtos e informe qual o produto você deve comprar," +
                    "sabendo que a decisão é sempre pelo mais barato")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o preço do Camil: ");
        double camil = scan.nextDouble();

        System.out.print("Informe o preço do Agulhinha: ");
        double agulhinha = scan.nextDouble();

        System.out.print("Informe o preço do Tio João: ");
        double tioJoao = scan.nextDouble();

        /**
         * Lógica para identtificar dentre 3 produtos com 3 valores qual o mais barato
         */
        if (camil <= agulhinha && camil <= tioJoao){
            System.out.println("Você deve optar pelo Camil por R$ " + camil);
        } else if (agulhinha <= camil && agulhinha <= tioJoao){
            System.out.println("Você deve optar pelo Agulhinha por R$ " + agulhinha);
        } else if (tioJoao <= camil && tioJoao <= agulhinha){
            System.out.println("Você deve optar pelo Tio João por R$ " + tioJoao);
        }
    }
}
