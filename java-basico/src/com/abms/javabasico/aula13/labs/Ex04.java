/*
Faça um programa que peça as 4 notas bimestrais e mostre a média.
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a nota 1: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a nota 2: ");
        double nota2 = scan.nextDouble();

        System.out.println("Entre com a nota 3: ");
        double nota3 = scan.nextDouble();

        System.out.println("Entre com a nota 4: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas informadas é de " + media);
    }
}
