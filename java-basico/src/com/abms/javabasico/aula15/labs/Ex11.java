/*
 As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o salário do colaborador? R$ ");
        double salarioBase = scan.nextDouble();

        double valorReajuste;
        double salarioReajustado;
        int percentualReajuste;

        if(salarioBase <= 280){
            percentualReajuste = 20;
            valorReajuste = salarioBase * percentualReajuste / 100;
            salarioReajustado = salarioBase + valorReajuste;
        }else if(salarioBase <= 700){
            percentualReajuste = 15;
            valorReajuste = salarioBase * percentualReajuste / 100;
            salarioReajustado = salarioBase + valorReajuste;
        } else if (salarioBase <= 1500) {
            percentualReajuste = 10;
            valorReajuste = salarioBase * percentualReajuste / 100;
            salarioReajustado = salarioBase + valorReajuste;
        }else {
            percentualReajuste = 5;
            valorReajuste = salarioBase * percentualReajuste / 100;
            salarioReajustado = salarioBase + valorReajuste;
        }
        System.out.println("Salario antes do reajuste: R$" + salarioBase);
        System.out.println("Percentual de reajuste: " + percentualReajuste+"%");
        System.out.println("Valor de reajuste: R$" + valorReajuste);
        System.out.println("Salário após reajuste: R$" + salarioReajustado);

    }
}
