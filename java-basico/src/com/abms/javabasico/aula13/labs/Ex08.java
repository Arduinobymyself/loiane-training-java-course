/*
Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas
trabalhadas no m�s.
Calcule e mostre o total de seu sal�rio no referido m�s.
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor da hora e a quantidade de horas trabalhadas durante o m�s: ");
        double valorPorHora = scan.nextDouble();
        int qtdeHorasTrabalhadas = scan.nextInt();
        double salarioMensal = valorPorHora * qtdeHorasTrabalhadas;
        System.out.println("Neste m�s voce receber�: R$" + salarioMensal);

    }
}
