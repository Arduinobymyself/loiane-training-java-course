/*
João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
 */


package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o peso de peixe pescado: ");
        double pesoPeixe = scan.nextDouble();
        double pesoExcedente = pesoPeixe % 50;
        double multa = pesoExcedente * 4;
        if(pesoExcedente > 0){
            System.out.println("João você deve pargar R$ " + multa + " de multa.");
        }else {
            System.out.println("João você não pagará multa nesta pescaria.");
        }

    }
}
