/*
Jo�o Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento di�rio de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que
voc� fa�a um programa que leia a vari�vel peso (peso de peixes) e
verifique se h� excesso. Se houver, gravar na vari�vel excesso e na
vari�vel multa o valor da multa que Jo�o dever� pagar. Caso contr�rio
mostrar tais vari�veis com o conte�do ZERO.
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
            System.out.println("Jo�o voc� deve pargar R$ " + multa + " de multa.");
        }else {
            System.out.println("Jo�o voc� n�o pagar� multa nesta pescaria.");
        }

    }
}
