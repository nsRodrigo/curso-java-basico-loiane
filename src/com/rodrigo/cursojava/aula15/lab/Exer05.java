package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer05 {

    @Description(   "Faça um programa para a leitura de duas notas parciais de um aluno" +
                    "O programa deve calcular a média alcançada por aluno e apresentar:" +
                    "Aprovado - se a média for maior ou igual a 7" +
                    "Reprovado - se a média for menor do que 7" +
                    "Aprovado com Distinção - se a média for igual a 10"    )

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        /**
         * Lógica para verificar a média e status de 1 aluno
         */
        if (media >= 7){
            System.out.println(media + " = Aluno Aprovado");
        } else if (media < 7){
            System.out.println(media + " = Aluno Reprovado");
        } else if (media == 10){
            System.out.println(media + " = Aluno Aprovado sem Distinção");
        }
    }
}
