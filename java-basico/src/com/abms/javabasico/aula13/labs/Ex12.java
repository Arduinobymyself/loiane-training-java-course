/*
Tenho como dados de entrada a altura de uma pessoa,
construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula:
(72.7 * altura) - 58
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com sua altura: ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);


    }
}
