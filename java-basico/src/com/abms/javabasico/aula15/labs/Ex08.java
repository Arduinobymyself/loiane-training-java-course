/*
Fa�a um programa que pergunte o pre�o de tr�s produtos e informe
qual produto voc� deve comprar, sabendo que a decis�o � sempre
pelo mais barato.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o pre�o do primeiro produto (p1): ");
        double p1 = scan.nextDouble();
        System.out.println("Entre o pre�o do segundo produto (p2): ");
        double p2 = scan.nextDouble();
        System.out.println("Entre o pre�o do terceiro produto (p3): ");
        double p3 = scan.nextDouble();

        if(p3 <= p2 && p3 <= p1){
            System.out.println("Comprar o terceiro produto (p3)");
        } else if(p2 <= p3 && p2 <= p1){
            System.out.println("Comprar o segundo produto (p2)");
        }else if(p1 <= p2 && p1 <= p3){
            System.out.println("Comprar o primeiro produto (p1)");
        }
    }
}
