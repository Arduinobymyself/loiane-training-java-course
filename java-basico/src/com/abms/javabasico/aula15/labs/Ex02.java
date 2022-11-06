/*
Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número diferente de 0: ");
        int numero = scan.nextInt();
        if(numero > 0){
            System.out.println(numero + " é positivo");
        }else if(numero < 0) {
            System.out.println(numero + " é negativo");
        }else{
            System.out.println("O número informado é Zero!");
        }
    }
}
