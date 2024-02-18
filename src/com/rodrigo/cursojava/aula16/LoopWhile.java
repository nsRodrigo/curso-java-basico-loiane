package com.rodrigo.cursojava.aula16;

public class LoopWhile {

    public static void main(String [] args){

        int i = 0;
        int max = 10;

        while (i < max){
            System.out.println("Valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
        }
        System.out.println("Valor de i = " + i);

        do{
            i++;
            System.out.println("Valor de i = " + i);
        } while (i < 15);
        System.out.println("Valor de i com do: " + i);
    }
}
