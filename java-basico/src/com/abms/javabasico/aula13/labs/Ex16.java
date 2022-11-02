/*
Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a área ser pintada em m^2: ");
        double area = scan.nextDouble();

        double qtdeLitros = area / 3;
        System.out.println(qtdeLitros);
        double qtdeLatas18 = Math.round(qtdeLitros / 18) + 1;
        System.out.println(qtdeLatas18);
        double valorLata18 = 80;
        double valorTotal = qtdeLatas18 * valorLata18;

        System.out.println("Você deverá comprar " + qtdeLatas18 + " latas de 18L e o valor total ficará em R$" + valorTotal);


    }
}
