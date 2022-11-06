/*
Faça um Programa que peça dois números e imprima o maior deles.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o primeiro número (n1): ");
        int n1 = scan.nextInt();
        System.out.println("Entre o segundo número (n2): ");
        int  n2 = scan.nextInt();
        if(n1 > n2){
            System.out.println("n1 é maior que n2");
        }else if(n1 < n2){
            System.out.println("n1 é menor que n2");
        } else{
            System.out.println("n1 é igual a n2");
        }

    }
}
