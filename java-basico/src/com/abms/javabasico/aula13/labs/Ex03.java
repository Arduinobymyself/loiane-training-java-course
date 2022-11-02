/*
Faça um programa que peça dois numeros e imprima a soma.
 */

package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " é " + soma);
    }
}
