/*
Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem
decrescente.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o pre�o do primeiro n�mero (n1): ");
        int n1 = scan.nextInt();
        System.out.println("Entre o pre�o do segundo n�mero (n2): ");
        int n2 = scan.nextInt();
        System.out.println("Entre o pre�o do terceiro n�mero (n3): ");
        int n3 = scan.nextInt();

        if(n1 > n2 && n2 > n3){
            System.out.println(+n1+" - "+n2+" - "+n3);
        }else if(n2 > n1 & n1 > n3){
            System.out.println(n2+" - "+n1+" - "+n3);
        }else if(n1 > n3 & n3 > n2){
            System.out.println(n1+" - "+n3+" - "+n2);
        }else if(n3 > n1 & n1 > n2){
            System.out.println(n3+" - "+n1+" - "+n2);
        }else if(n2 > n3 & n3 > n1){
            System.out.println(n2+" - "+n3+" - "+n1);
        }else if(n3 > n2 & n2 > n1){
            System.out.println(n3+" - "+n2+" - "+n1);
        }





    }
}
