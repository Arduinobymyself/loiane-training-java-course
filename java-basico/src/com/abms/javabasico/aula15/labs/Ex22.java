/*
Fa�a um Programa que pe�a um n�mero inteiro e determine se ele �
par ou impar. Dica: utilize o operador m�dulo (resto da divis�o).
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um n�mero inteiro: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("O n�mero digitado � PAR!");
        }else {
            System.out.println("O n�mero digitado � IMPAR!");
        }

    }
}
