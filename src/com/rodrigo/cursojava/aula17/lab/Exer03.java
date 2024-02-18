package com.rodrigo.cursojava.aula17.lab;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String genero;
        String estadoCivil;

        /**
         * Informar um nome com mais de 3 caracteres
         */
        do {

            System.out.print("Entre com o nome: ");
            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                infoValida = false;
                System.out.println("Nome inválido precisa ser igual ou maior que 3 caracteres");
            }

        } while (!infoValida);

        infoValida = false;

        /**
         * Informar uma idade que tenha entre 0 e 150 anos
         */
        do {

            System.out.print("Entre com a idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade < 150) {
                infoValida = true;
            } else {
                infoValida = false;
                System.out.println("Idade precisa ser entre 0 e 150");
            }

        } while (!infoValida);

        infoValida = false;

        /**
         * Informar salário que precisa ser maior que '0'
         */
        do {

            System.out.print("Entre com o salario: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                infoValida = false;
                System.out.println("Salario precisa ser maios que 0");
            }

        } while (!infoValida);

        infoValida = false;

        /**
         * Informar o genero entre 'f' ou 'm'
         */
        do {

            System.out.print("Entre com o genero: ");
            genero = scan.next();

            if (genero.equalsIgnoreCase("f") || (genero.equalsIgnoreCase("m"))) {
                infoValida = true;
            } else {
                infoValida = false;
                System.out.println("Genero inválido");
            }

        } while (!infoValida);

        infoValida = false;

        /**
         * Informar o estado civil com 's', 'c', 'v' ou 'd'
         */
        do {

            System.out.print("Entre com o Estado Civil: ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") || (estadoCivil.equalsIgnoreCase("c")) || (estadoCivil.equalsIgnoreCase("v")) || (estadoCivil.equalsIgnoreCase("d"))) {
                infoValida = true;
            } else {
                infoValida = false;
                System.out.println("Estado Civil precisa ser 's', 'c', 'v' ou 'd'");
            }

        } while (!infoValida);

        System.out.println();
        System.out.println("Informações coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Genero: " + genero);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
