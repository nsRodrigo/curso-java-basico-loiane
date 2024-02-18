package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.apache.xml.internal.security.c14n.CanonicalizerSpi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o ano: ");
        int anos = scan.nextInt();

        if ((anos % 400 == 0) || (anos % 4 == 0 && anos % 100 != 0)) {
            System.out.println("Não é Bissexto");
        } else {
            System.out.println("È Bissexto");
        }
    }
}
