/*
Fa�a um Programa que pe�a um valor e mostre na tela se o valor �
positivo ou negativo.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um n�mero diferente de 0: ");
        int numero = scan.nextInt();
        if(numero > 0){
            System.out.println(numero + " � positivo");
        }else if(numero < 0) {
            System.out.println(numero + " � negativo");
        }else{
            System.out.println("O n�mero informado � Zero!");
        }
    }
}
