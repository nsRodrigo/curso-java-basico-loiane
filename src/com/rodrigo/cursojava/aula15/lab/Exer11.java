package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer11 {

    @Description("As organizações tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes" +

                    "1 - Faça um programa que recebe o salário de um colaborador e o reajuste segundo os seguinte critério, baseado no salário atual:" +
                        "- Salários até R$ 280,00 (incluindo): aumento de 20%" +
                        "- Salários entre R$ 280,00 e R$ 700,00: aumento de 15%" +
                        "- Salários entre R$ 700,00 e R$ 1.500,00: aumento de 10%" +
                        "- Salários a partir de R$ 1.500,00: aumento de 5%" +

                    "2 - Após o aumento ser realizado, informar na tela: " +
                        "- Salário antes do reajuste" +
                        "- Percentual do aumento" +
                        "- Valor do aumento" +
                        "- Salário após o reajuste")

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o salário do colaborador: R$ ");
        double salario = scan.nextDouble();

        int percentual = 0;

        /**
         * Lógica para verificar o percentual de acordo com o valor do salário
         */
        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario <= 700){
            percentual = 15;
        } else if (salario > 700 && salario <= 1500){
            percentual = 10;
        } else if (salario > 1500){
            percentual = 5;
        }

        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        /**
         * Resultados:
         */
        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.println("Aumento de " + percentual + "%");
        System.out.println("Reajuste será no valor de: R$" + aumento);
        System.out.println("Salário após o reajuste: R$" + salarioAjustado);
    }
}
