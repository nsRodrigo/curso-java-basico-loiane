package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer10 {

    @Description(   "Faça um programa que pergunte em que turno você estuda." +
                    "Peça pra digitar e responda de acordo com com o correto:" +
                    "M - Matituno = Bom dia!" +
                    "V - Vespertino = Boa Tarde!" +
                    "N - Noturno = Boa Noite!" +
                    "Valor Inválido"    )

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.print("Em qual turno você estuda (M - Matituno | V - Vespertino | N - Noturno): ");
        String turno = scan.next();

        /**
         * Lógica retorna mesnsagem de acordo com o valor do turno informado
         */
        if (turno.equalsIgnoreCase("m")){
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("v")){
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("n")){
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido");
        }

        /**
         * Lógica retorna mesnsagem de acordo com o valor do turno informado utilizando o Switch
         */
        switch (turno){
            case "m":
            case "M": System.out.println("Bom dia!");
                break;
            case "v":
            case "V": System.out.println("Boa tarde!");
                break;
            case "n":
            case "N": System.out.println("Boa noite!");
                break;
            default: System.out.println("Valor inválido");
        }
    }
}
