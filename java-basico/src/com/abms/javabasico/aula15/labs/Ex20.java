/*
Fa�a um Programa para leitura de tr�s notas parciais de um aluno. O
programa deve calcular a m�dia alcan�ada por aluno e presentar:
. A mensagem "Aprovado", se a m�dia for maior ou igual a 7,
com a respectiva m�dia alcan�ada;
a. A mensagem "Reprovado", se a m�dia for menor do que 7, com
a respectiva m�dia alcan�ada;
b. A mensagem "Aprovado com Distin��o", se a m�dia for igual a
10.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a nota 1 (n1): ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com a nota 1 (n1): ");
        double n2 = scan.nextDouble();
        System.out.println("Entre com a nota 1 (n1): ");
        double n3 = scan.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com Distin��o! m�dia = "+media);
        } else if (media >= 7) {
            System.out.println("Aprovado! m�dia = "+media);
        } else {
            System.out.println("Reprovado! m�dia "+media);
        }


    }
}
