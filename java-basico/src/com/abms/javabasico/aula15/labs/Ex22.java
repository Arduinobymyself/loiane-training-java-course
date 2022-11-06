/*
Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("O número digitado é PAR!");
        }else {
            System.out.println("O número digitado é IMPAR!");
        }

    }
}
