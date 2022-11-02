/*
Faça um programa que peça a temperatura em graus Celsius,
transfoem e mostre em graus Farenheit.
F = 9 * C / 5 + 32
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a Temperatura em Celsius: ");
        double C = scan.nextDouble();
        double F = 9 * C / 5 + 32;
        System.out.println(C + " graus Celsius equivalem a " + F + " graus Farenheit");
    }
}
