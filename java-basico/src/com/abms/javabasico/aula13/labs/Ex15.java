/*
Fa�a um Programa que pergunte quanto voc� ganha por hora e o
n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
programa que nos d�:
. sal�rio bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o sal�rio l�quido.
d. calcule os descontos e o sal�rio l�quido, conforme a tabela
abaixo:
+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
Liquido : R$
Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.

 */



package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor em R$ por hora de trabalho: ");
        double valorPorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas durante o m�s: ");
        double qtdeHorasTrabalhadas = scan.nextDouble();
        double salarioBruto = valorPorHora * qtdeHorasTrabalhadas;
        double ir = 11*salarioBruto/100;
        double inss = 8*salarioBruto/100;
        double sindicato = 5*salarioBruto/100;
        double totalDescontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Sal�rio Bruto:      R$" + salarioBruto);
        System.out.println("INSS:               R$" + inss);
        System.out.println("IR:                 R$" + ir);
        System.out.println("Sindicato:          R$" + sindicato);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Sal�rio l�quido:    R$" + salarioLiquido);








    }
}
