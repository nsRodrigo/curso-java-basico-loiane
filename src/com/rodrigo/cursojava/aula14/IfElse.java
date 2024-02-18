package com.rodrigo.cursojava.aula14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Entre com sua Idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de Idade");
        } else {
            System.out.println("Não é maior de Idade");
        }*/

        System.out.println("Entre com preço do Item: ");
        double valor = scan.nextDouble();

        //Condição
        if (valor <= 10){
            System.out.println("Está barato");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pedir desconto");
        } else if (valor > 15 && valor < 17) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }
    }
}
