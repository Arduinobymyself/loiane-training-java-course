/*
 Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o valor da hora trabalhada? R$ ");
        double valorHora = scan.nextDouble();
        System.out.println("Qual foi a quantidade de horas trabalhadas? ");
        double qtdeHoras = scan.nextDouble();

        double salarioBruto = valorHora* qtdeHoras;
        int percentualIR;
        double ir;
        double inss = salarioBruto*10/100;
        double sindicato =salarioBruto*3/100;
        double fgts = salarioBruto*11/100;
        double totalDescontos;
        double salarioLiquido;

        if(salarioBruto <= 980){
            percentualIR = 0;
            ir = salarioBruto*percentualIR/100;
            totalDescontos = inss+ir;
            salarioLiquido = salarioBruto - totalDescontos;
        }else if(salarioBruto <= 1500){
            percentualIR = 5;
            ir = salarioBruto*percentualIR/100;
            totalDescontos = inss+ir;
            salarioLiquido = salarioBruto - totalDescontos;
        } else if (salarioBruto <= 2500) {
            percentualIR = 10;
            ir = salarioBruto*percentualIR/100;
            totalDescontos = inss+ir;
            salarioLiquido = salarioBruto - totalDescontos;
        }else{
            percentualIR = 20;
            ir = salarioBruto*percentualIR/100;
            totalDescontos = inss+ir;
            salarioLiquido = salarioBruto - totalDescontos;
        }

        System.out.println("Salário Bruto: ("+valorHora+" * "+qtdeHoras+")\t: R$ "+salarioBruto);
        System.out.println("(-) IR ("+percentualIR+"%)\t\t\t\t\t: R$ "+ir);
        System.out.println("(-) INSS (10%)\t\t\t\t\t: R$ "+inss);
        System.out.println("FGTS (11%)\t\t\t\t\t\t: R$ "+fgts);
        System.out.println("Total Descontos\t\t\t\t\t: R$ "+totalDescontos);
        System.out.println("Salário Líquido\t\t\t\t\t: R$ "+salarioLiquido);



    }
}
