/*
 Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao
usu�rio qual opera��o ele deseja realizar. O resultado da opera��o
deve ser acompanhado de uma frase que diga se o n�mero �:
. par ou �mpar;
a. positivo ou negativo;
b. inteiro ou decimal.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro n�mero (n1): ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com o segundo n�mero (n1): ");
        double n2 = scan.nextDouble();
        System.out.println("Qual opera��o deseja efetuar?" +
                "\n1 - Adic�ao" +
                "\n2 - Subtra��o" +
                "\n3 - Multiplica��o" +
                "\n4 - Divis�o");
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
                System.out.println("Opera��o Inv�lida!");
                break;
        }

        System.out.println("RESULTADO: "+calculo);

        if (calculo >= 0 ){
            System.out.println("O resultado da opera��o � POSITIVO!");
        }else {
            System.out.println("O resultado da opera��o � NEGATIVO!");
        }

        temp = calculo - Math.round(calculo);
        if (temp == 0){
            System.out.println("O resultado da opera��o � INTEIRO");
            if (calculo % 2 == 0){
                System.out.println("O resultado da opera��o � PAR!");
            }else {
                System.out.println("O resultado da opera��o � IMPAR!");
            }
        }else {
            System.out.println("O resultado da opera��o � DECIMAL");
        }
    }
}
