/*
Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        double PI = 3.1415927d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio do c�rculo: ");
        double raio = scan.nextDouble();
        double area = PI * raio * raio;
        System.out.println("Uma circunfer�ncia de raio " + raio + "cm tem �rea de " + area + "cm^2.");

    }
}
