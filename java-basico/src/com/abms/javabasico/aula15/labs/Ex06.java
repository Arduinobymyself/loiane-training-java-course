/*
Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o primeiro n�mero: ");
        int n1 = scan.nextInt();
        System.out.println("Entre o segundo n�mero: ");
        int n2 = scan.nextInt();
        System.out.println("Entre o terceiro n�mero: ");
        int n3 = scan.nextInt();

        if(n1 >= n2 && n1 >= n3){
            System.out.println("O primeiro n�mero � o maior");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("O segundo n�mero � o maior");
        } else if (n3 >= n1 && n3 >= n2) {
            System.out.println("O terceiro n�mero � o maior");
        }

    }
}
