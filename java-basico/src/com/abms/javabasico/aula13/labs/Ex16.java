/*
Fa�a um programa para uma loja de tintas. O programa dever� pedir o
tamanho em metros quadrados da �rea a ser pintada. Considere que a
cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a
tinta � vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usu�rio a quantidades de latas de tinta a serem compradas e o pre�o
total
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a �rea ser pintada em m^2: ");
        double area = scan.nextDouble();

        double qtdeLitros = area / 3;
        System.out.println(qtdeLitros);
        double qtdeLatas18 = Math.round(qtdeLitros / 18) + 1;
        System.out.println(qtdeLatas18);
        double valorLata18 = 80;
        double valorTotal = qtdeLatas18 * valorLata18;

        System.out.println("Voc� dever� comprar " + qtdeLatas18 + " latas de 18L e o valor total ficar� em R$" + valorTotal);


    }
}
