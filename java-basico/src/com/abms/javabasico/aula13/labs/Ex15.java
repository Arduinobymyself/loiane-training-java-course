/*
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.

 */



package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor em R$ por hora de trabalho: ");
        double valorPorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas durante o mês: ");
        double qtdeHorasTrabalhadas = scan.nextDouble();
        double salarioBruto = valorPorHora * qtdeHorasTrabalhadas;
        double ir = 11*salarioBruto/100;
        double inss = 8*salarioBruto/100;
        double sindicato = 5*salarioBruto/100;
        double totalDescontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto:      R$" + salarioBruto);
        System.out.println("INSS:               R$" + inss);
        System.out.println("IR:                 R$" + ir);
        System.out.println("Sindicato:          R$" + sindicato);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Salário líquido:    R$" + salarioLiquido);








    }
}
