/*
Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o primeiro n�mero (n1): ");
        int n1 = scan.nextInt();
        System.out.println("Entre o segundo n�mero (n2): ");
        int  n2 = scan.nextInt();
        if(n1 > n2){
            System.out.println("n1 � maior que n2");
        }else if(n1 < n2){
            System.out.println("n1 � menor que n2");
        } else{
            System.out.println("n1 � igual a n2");
        }

    }
}
