/*
Fa�a um programa que calcule as ra�zes de uma equa��o do segundo
grau, na forma ax2 + bx + c. O programa dever� pedir os valores de a,
b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes
situa��es:
a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o �
do segundo grau e o programa n�o deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equa��o n�o possui raizes
reais. Informe ao usu�rio e encerre o programa;
c. Se o delta calculado for igual a zero a equa��o possui apenas
uma raiz real; informe-a ao usu�rio;
d. Se o delta for positivo, a equa��o possui duas raiz reais;
informe-as ao usu�rio;
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor de A: ");
        int A = scan.nextInt();

        double delta;
        double raiz1;
        double raiz2;


        if (A != 0){
            System.out.println("Entre com o valor de B: ");
            int B = scan.nextInt();
            System.out.println("Entre com o valor de C: ");
            int C = scan.nextInt();
            delta = Math.pow(B,2)-4*A*C;
            System.out.println("a = "+A);
            System.out.println("b = "+B);
            System.out.println("c = "+C);
            System.out.println("Delta = " + delta);
            if (delta >= 0){
                if (delta == 0){
                    raiz1 = (-B)/(2*A);
                    System.out.println("A equa��o possui apenas uma raiz Real");
                    System.out.println("X = "+raiz1);
                }else {
                    raiz1 = (-B+Math.sqrt(delta))/(2*A);
                    raiz2 = (-B-Math.sqrt(delta))/(2*A);
                    System.out.println("A equa��o possui duas ra�zes Reais:");
                    System.out.println("X1 = "+raiz1);
                    System.out.println("X2 = "+raiz2);
                }


            }else {
                System.out.println("A equa��o n�o possui raizes reais!");
            }

        }else {
            System.out.println("N�o � uma equa��o de segundo grau");
        }


    }
}
