package com.rodrigo.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Telefonou para a vitima? ");
        String resposta1 = scan.next();

        System.out.print("Esteve no local do crime? ");
        String resposta2 = scan.next();

        System.out.print("Mora perto da vitima? ");
        String resposta3 = scan.next();

        System.out.print("Devia para a vitima? ");
        String resposta4 = scan.next();

        System.out.print("Ja trabalhou com a vitime? ");
        String resposta5 = scan.next();

        int cont = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta2.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta3.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta4.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta5.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cumplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }
    }
}
