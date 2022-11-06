/*
 As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos
seus colaboradores e lhe contraram para desenvolver o programa que
calcular� os reajustes.
o Fa�a um programa que recebe o sal�rio de um colaborador e o
reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
o sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
o sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
o sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o
aumento ser realizado, informe na tela:
o o sal�rio antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo sal�rio, ap�s o aumento
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual � o sal�rio do colaborador? R$ ");
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
        System.out.println("Sal�rio ap�s reajuste: R$" + salarioReajustado);

    }
}
