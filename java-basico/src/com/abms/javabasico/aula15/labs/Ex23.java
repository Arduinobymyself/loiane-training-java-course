/*
 Faça um Programa que peça um número e informe se o número é
inteiro ou decimal. Dica: utilize uma função de arredondamento.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número:");
        double numero = scan.nextDouble();

        numero = numero - Math.round(numero);
        if (numero == 0){
            System.out.println("O resultado da operação é INTEIRO");
        }else {
            System.out.println("O resultado da operação é DECIMAL");
        }
    }
}
