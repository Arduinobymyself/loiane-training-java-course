/*
 Fa�a um Programa que pe�a um n�mero e informe se o n�mero �
inteiro ou decimal. Dica: utilize uma fun��o de arredondamento.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um n�mero:");
        double numero = scan.nextDouble();

        numero = numero - Math.round(numero);
        if (numero == 0){
            System.out.println("O resultado da opera��o � INTEIRO");
        }else {
            System.out.println("O resultado da opera��o � DECIMAL");
        }
    }
}
