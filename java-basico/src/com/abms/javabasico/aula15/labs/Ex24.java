/*
 Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número (n1): ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com o segundo número (n1): ");
        double n2 = scan.nextDouble();
        System.out.println("Qual operação deseja efetuar?" +
                "\n1 - Adicçao" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão");
        int operacao = scan.nextInt();
        double calculo = 0;
        double temp = 0;



        switch (operacao){
            case 1:
                calculo = n1 + n2;
                break;
            case 2:
                calculo = n1 - n2;
                break;
            case 3:
                calculo = n1 * n2;
                break;
            case 4:
                if(n1 != 0){
                    calculo = n1 / n2;
                }else {
                    System.out.println("(n1) deve ser diferente de zero!");
                    break;
                }
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }

        System.out.println("RESULTADO: "+calculo);

        if (calculo >= 0 ){
            System.out.println("O resultado da operação é POSITIVO!");
        }else {
            System.out.println("O resultado da operação é NEGATIVO!");
        }

        temp = calculo - Math.round(calculo);
        if (temp == 0){
            System.out.println("O resultado da operação é INTEIRO");
            if (calculo % 2 == 0){
                System.out.println("O resultado da operação é PAR!");
            }else {
                System.out.println("O resultado da operação é IMPAR!");
            }
        }else {
            System.out.println("O resultado da operação é DECIMAL");
        }
    }
}
