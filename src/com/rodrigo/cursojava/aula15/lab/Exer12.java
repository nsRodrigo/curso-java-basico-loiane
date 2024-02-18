package com.rodrigo.cursojava.aula15.lab;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Scanner;

public class Exer12 {

    @Description(   "Faça um programa para o cálculo de uma folha de pagamento." +

                    "Sabendo que:" +
                        "Os descontos do imposto de Renda depende do salário bruto (conforme tabela abaixo)" +
                        "3% é para o Sindicato" +
                        "O FGTS corresponbde a 11% do Salário Bruto, porem, não é descontado (é a empresa quem deposita)" +
                        "O Salário Liquido corresponde ao bruto menos os descontos" +

                    "O Programa deverá pedir:" +
                        "O valor da sua hora" +
                        "A quantidade de horas trabalhadas no mês" +

                    "Desconto IR: " +
                    "Salário Bruto até R$900 - Isento" +
                    "Salário Bruto até R$1500 - 5%" +
                    "Salário Bruto até R$2500 - 10%" +
                    "Salário Bruto acima R$2500 - 20%" +

                    "" +
            "")
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor da hora trabalhada: R$");
        double valorHora = scan.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        /**
         * Lógica para veriificar o desconto do IR
         */
        int percentualIR = 0;

        if (salarioBruto <= 900){
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500){
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto + totalDescontos;

        /**
         * Resultado dos descontos
         */
        System.out.println("*********************************************");
        System.out.println("Salário Bruto: (R$ "+ valorHora + " * " + horasTrabalhadas + ") R$ " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%): R$ " + ir);
        System.out.println("(-) INSS (10%): R$" + inss);
        System.out.println("FGTS (11%) = R$" + fgts);
        System.out.println("Total de desconto = R$ " + totalDescontos);
        System.out.println("Salário Liquido = R$ " + salarioLiquido);
        System.out.println("*********************************************");
    }
}
