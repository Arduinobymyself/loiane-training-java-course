/*
 O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:
o Até 5 Kg Acima de 5 Kg
o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o total a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preço total, tipo de pagamento, valor do
desconto e valor a pagar.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o tipo da Carne");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("1 - picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade em Kg");
        double qtde = scan.nextDouble();
        double precoKg = 0;


        if (tipo == 1){
            System.out.println(qtde+"Kg - file duplo");
            if (qtde < 5){
                precoKg = 4.9;
            }else {
                precoKg = 5.8;
            }

        }

        if (tipo == 2){
            System.out.println(qtde+"Kg - alcatra");
            if (qtde < 5){
                precoKg = 5.9;
            }else {
                precoKg = 6.8;
            }
        }

        if (tipo == 3){
            System.out.println(qtde+"Kg - picanha");
            if (qtde < 5){
                precoKg = 6.9;
            }else {
                precoKg = 7.8;
            }
        }
        double total = qtde * precoKg;
        System.out.println(qtde+"Kg * "+precoKg+" = R$"+total);
        System.out.println("Qual a forma de pagamento?");
        System.out.println("1 - débito (sem desconto)");
        System.out.println("2 - credito (com 5% de desconto)");
        int formaPagamento = scan.nextInt();

        if (formaPagamento == 2){
            double desconto = total * 5 / 100;
            System.out.println("Desconto de "+ desconto);
            System.out.println("total com desconto : R$"+(total-desconto));
        }else {
            System.out.println("Total a pagar sem desconto: R$"+total);
        }
















    }
}
