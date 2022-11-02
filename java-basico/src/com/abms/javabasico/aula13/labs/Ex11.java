/*
Faça um programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do primiero com metade do segundo
b. a soma do triplo do primeiro com o terceiro
c. o terceiro elevado ao cubo
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre um número inteiro: ");
        int n1 = scan.nextInt();
        System.out.println("Entre outro número inteiro: ");
        int n2 = scan.nextInt();
        System.out.println("Entre um número real: ");
        double n3 = scan.nextDouble();

        double a = (2 * n1) * (n2 / 2);
        double b = (3  * n1) + n3;
        double c = n3 * n3 * n3;

        System.out.println("O produto do primiero com metade do segundo é " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro é " + b);
        System.out.println("O terceiro elevado ao cubo é " + c);


    }
}
