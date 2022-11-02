/*
Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor do lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = lado * lado;
        System.out.println("O dobro da área de um quadrado de lado " + lado + " é " + 2*area);

    }
}
