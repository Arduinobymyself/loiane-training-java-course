/*
Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado A: ");
        int ladoA = scan.nextInt();
        System.out.println("Entre com o lado B: ");
        int ladoB = scan.nextInt();
        System.out.println("Entre com o lado C: ");
        int ladoC = scan.nextInt();

        if ((Math.abs((ladoB-ladoC))<ladoA && ladoA<(ladoB+ladoC)) ||
                (Math.abs((ladoA-ladoC))<ladoB && ladoB<(ladoA+ladoC)) ||
                (Math.abs((ladoA-ladoB))<ladoC && ladoC<(ladoA+ladoB))){
            System.out.println("Os valores informados podem formar um Triângulo");

            if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("O Triângulo formado é Equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O Triângulo formado é Isóceles.");
            }else {
                System.out.println("O Triângulo formado é Escaleno.");
            }

        }else{
            System.out.println("Os valores dos lados informados não podem formam um Triângulo!");
        }
    }
}
