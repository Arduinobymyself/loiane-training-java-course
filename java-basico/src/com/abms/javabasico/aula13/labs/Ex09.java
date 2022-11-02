/*
Faça um programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
C = (5 * (F - 32) / 9)
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a Temperatura em Farenheit: ");
        double F = scan.nextDouble();
        double C = (5 * (F - 32) / 9);
        System.out.println(F + " graus Farenheit equivalem a " + C + " graus Celsius");


    }
}
