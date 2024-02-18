package com.rodrigo.cursojava.aula17;

import com.sun.org.glassfish.gmbal.Description;

public class LoopFor {

    @Description("for (inicialização; condição; atualização){" +
                 "      bloco de código"                       +
                 "}"                                            )
    public static void main(String [] args){

        /**
         * For com uma variável
         */
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Valor de i = " + i);
        }

        for (int i = 5 ; i > 0 ; i--){
            System.out.println("Valor de i = " + i);
        }

        /**
         * For com mais de uma Variável
         */
        for (int i = 0 , j = 10 ; i < j ; i++ , j--){
            System.out.println("Valores: i = " + i + " | j = " + j);
        }

        for (int i = 0 , j = 10 ; i <= j ; i++ , j--){
            System.out.println("Valores: i = " + i + " | j = " + j);
        }

        /**
         * Partes Ausentes
         */
        int count = 0;
        for ( ; count < 10 ; ){
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        for (int cont = 0 ; cont < 10 ; cont += 2){
            System.out.println("Valor de cont: " + cont);
        }

        int soma = 0;
        for (int i = 1 ; i < 5 ; soma += i++){
            System.out.println("Valor da soma é: " + soma);
        }
    }
}
