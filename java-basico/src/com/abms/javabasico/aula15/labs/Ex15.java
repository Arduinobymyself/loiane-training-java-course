/*
Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa
dever� informar se os valores podem ser um tri�ngulo. Indique, caso
os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
escaleno.
o Dicas:
o Tr�s lados formam um tri�ngulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Tri�ngulo Equil�tero: tr�s lados iguais;
o Tri�ngulo Is�sceles: quaisquer dois lados iguais;
o Tri�ngulo Escaleno: tr�s lados diferentes;
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
            System.out.println("Os valores informados podem formar um Tri�ngulo");

            if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("O Tri�ngulo formado � Equil�tero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O Tri�ngulo formado � Is�celes.");
            }else {
                System.out.println("O Tri�ngulo formado � Escaleno.");
            }

        }else{
            System.out.println("Os valores dos lados informados n�o podem formam um Tri�ngulo!");
        }
    }
}
