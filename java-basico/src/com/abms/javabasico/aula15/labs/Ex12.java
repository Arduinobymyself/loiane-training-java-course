/*
 Fa�a um programa para o c�lculo de uma folha de pagamento,
sabendo que os descontos s�o do Imposto de Renda, que depende do
sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado (�
a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio
Bruto menos os descontos. O programa dever� pedir ao usu�rio o
valor da sua hora e a quantidade de horas trabalhadas no m�s.
o Desconto do IR:
o Sal�rio Bruto at� 900 (inclusive) - isento
o Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
o Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
o Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela
as informa��es, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora � 5 e a quantidade de hora � 220
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual � o valor da hora trabalhada? R$ ");
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

        System.out.println("Sal�rio Bruto: ("+valorHora+" * "+qtdeHoras+")\t: R$ "+salarioBruto);
        System.out.println("(-) IR ("+percentualIR+"%)\t\t\t\t\t: R$ "+ir);
        System.out.println("(-) INSS (10%)\t\t\t\t\t: R$ "+inss);
        System.out.println("FGTS (11%)\t\t\t\t\t\t: R$ "+fgts);
        System.out.println("Total Descontos\t\t\t\t\t: R$ "+totalDescontos);
        System.out.println("Sal�rio L�quido\t\t\t\t\t: R$ "+salarioLiquido);



    }
}
