/*
Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor do lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = lado * lado;
        System.out.println("O dobro da �rea de um quadrado de lado " + lado + " � " + 2*area);

    }
}
