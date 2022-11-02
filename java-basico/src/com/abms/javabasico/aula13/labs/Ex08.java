/*
Faça um programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês.
Calcule e mostre o total de seu salário no referido mês.
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor da hora e a quantidade de horas trabalhadas durante o mês: ");
        double valorPorHora = scan.nextDouble();
        int qtdeHorasTrabalhadas = scan.nextInt();
        double salarioMensal = valorPorHora * qtdeHorasTrabalhadas;
        System.out.println("Neste mês voce receberá: R$" + salarioMensal);

    }
}
