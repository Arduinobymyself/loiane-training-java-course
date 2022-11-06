/*
. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade em Kg de Morango");
        double morangoKg = scan.nextDouble();

        System.out.println("Quantidade em Kg de Morango");
        double macaKg = scan.nextDouble();

        double totalKg;
        double totalValor;
        double morangoValor;
        double macaValor;
        double valorPagar = 0;

        if (morangoKg >= 5){
            morangoValor = morangoKg * 2.2;
        }else {
            morangoValor = morangoKg * 2.5;
        }

        if (macaKg >= 5){
            macaValor = macaKg * 1.5;
        }else {
            macaValor = macaKg * 1.8;
        }

        totalValor = morangoValor + macaValor;
        totalKg = morangoKg + macaKg;

        if(totalKg >= 8 || totalValor >= 25){
            valorPagar = totalValor - totalValor*10/100;
        }else {
            valorPagar = totalValor;
        }
        System.out.println("Voce comprou: \n"+morangoKg+"Kg de morango "+macaKg+"Kg de maçã.");
        System.out.println("Voce deve pagar R$"+valorPagar);





    }
}
