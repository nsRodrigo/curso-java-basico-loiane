package com.rodrigo.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valido = false;

        do {

            System.out.print("Entre com a População A: ");
            popA = scan.nextDouble();

            if (popA > 0){
                valido = true;
            } else {
                System.out.println("popA precisa ser maior que 0");
            }

            System.out.print("Entre com a População B: ");
            popB = scan.nextDouble();

            if (popB > 0){
                valido = true;
            } else {
                System.out.println("popB precisa ser maior que 0");
            }

        } while (!valido);

        valido = false;

        do {

            System.out.print("Entre com a Taxa de crescimento da População A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0){
                valido = true;
            } else {
                System.out.println("taxaA precisa ser maior que 0");
            }

            System.out.print("Entre com a Taxa de crescimento da População B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0){
                valido = true;
            } else {
                System.out.println("taxaB precisa ser maior que 0");
            }

        } while (!valido);

        int cont = 0;

        while (popA < popB){

            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qts Anos: " + cont);
    }
}
