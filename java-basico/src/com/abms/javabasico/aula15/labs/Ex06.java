/*
Faça um Programa que leia três números e mostre o maior deles.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Entre o segundo número: ");
        int n2 = scan.nextInt();
        System.out.println("Entre o terceiro número: ");
        int n3 = scan.nextInt();

        if(n1 >= n2 && n1 >= n3){
            System.out.println("O primeiro número é o maior");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("O segundo número é o maior");
        } else if (n3 >= n1 && n3 >= n2) {
            System.out.println("O terceiro número é o maior");
        }

    }
}
