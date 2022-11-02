/*
Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        double PI = 3.1415927d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo: ");
        double raio = scan.nextDouble();
        double area = PI * raio * raio;
        System.out.println("Uma circunferência de raio " + raio + "cm tem área de " + area + "cm^2.");

    }
}
