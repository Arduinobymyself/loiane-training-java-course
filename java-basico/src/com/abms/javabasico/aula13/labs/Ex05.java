/*
Fa�a um programa que converta metros para cent�metros.
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre um valor em metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + "m convertidos em cent�metros � igual a " + centimetros + "cm.");

    }
}
