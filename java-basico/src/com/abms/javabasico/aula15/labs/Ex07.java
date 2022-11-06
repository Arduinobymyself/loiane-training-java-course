/*
Faça um Programa que leia três números e mostre o maior e o menor
deles.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o primeiro número (n1): ");
        int n1 = scan.nextInt();
        System.out.println("Entre o segundo número (n2): ");
        int n2 = scan.nextInt();
        System.out.println("Entre o terceiro número: (n3)");
        int n3 = scan.nextInt();

        if(n1 > n2 && n2 > n3){
            System.out.println("O maior é n1 e o menor é n3");
        } else if (n1 > n3 && n3 > n2) {
            System.out.println("O maior é n1 e o menor é n2");
        } else if (n2 > n1 && n1 > n3) {
            System.out.println("O maior é  n2 e o menor é n3");
        } else if (n2 > n3 && n3 > n1) {
            System.out.println("O maior é n2 e o menor é n1");
        } else if (n3 > n1 && n1 > n2) {
            System.out.println("O maior é n3 e o menor é n2");
        }else if (n3 > n2 && n2 > n1) {
            System.out.println("O maior é n3 e o menor é n1");
        }
    }
}
