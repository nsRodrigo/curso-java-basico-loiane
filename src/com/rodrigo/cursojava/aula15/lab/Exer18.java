package com.rodrigo.cursojava.aula15.lab;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
