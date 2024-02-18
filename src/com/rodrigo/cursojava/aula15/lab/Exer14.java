package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer14 {

    @Description(   "Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao lonho de um semestre e calcule a sua média." +
                    "A atribuição de conceitos obedece á tabela abaixo:" +
                        "- Entre 9.0 e 10.0     A" +
                        "- Entre 7.5 e  9.0     B" +
                        "- Entre 6.0 e  7.5     C" +
                        "- Entre 6.0 e  4.0     D" +
                        "- Entre 4.0 e  0.0     E" +

                    "APROVADO Correspondem as notas A, B e C" +
                    "REPROVADO Carrespondem as notas D e E")

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";

        if (media > 9.0 && media <= 10.0){
            aproveitamento = "A";
        } else if (media > 7.5 && media <= 9.0){
            aproveitamento = "B";
        } else if (media > 6.0 && media <= 7.5){
            aproveitamento = "C";
        } else if (media > 4.0 && media <= 6.0){
            aproveitamento = "D";
        } else if (media <= 4.0){
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + media);
        System.out.println("Conceito: " + aproveitamento);

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("Aprovado");
                break;
            case "D":
            case "E":
                System.out.println("Reprovado");
                break;
        }
    }

}
