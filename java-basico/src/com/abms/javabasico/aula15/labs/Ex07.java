/*
Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor
deles.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o primeiro n�mero (n1): ");
        int n1 = scan.nextInt();
        System.out.println("Entre o segundo n�mero (n2): ");
        int n2 = scan.nextInt();
        System.out.println("Entre o terceiro n�mero: (n3)");
        int n3 = scan.nextInt();

        if(n1 > n2 && n2 > n3){
            System.out.println("O maior � n1 e o menor � n3");
        } else if (n1 > n3 && n3 > n2) {
            System.out.println("O maior � n1 e o menor � n2");
        } else if (n2 > n1 && n1 > n3) {
            System.out.println("O maior �  n2 e o menor � n3");
        } else if (n2 > n3 && n3 > n1) {
            System.out.println("O maior � n2 e o menor � n1");
        } else if (n3 > n1 && n1 > n2) {
            System.out.println("O maior � n3 e o menor � n2");
        }else if (n3 > n2 && n2 > n1) {
            System.out.println("O maior � n3 e o menor � n1");
        }
    }
}
