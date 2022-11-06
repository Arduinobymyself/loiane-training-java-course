/*
Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o ano a ser analisado: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println("O ano "+ano+" é bissexto (tem 366 dias)!");
        }else {
            System.out.println("O ano "+ano+" não é bissexto (tem 365 dias)!");
        }

    }
}
