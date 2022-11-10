/*
Faça um Programa para leitura de três notas parciais de um aluno. O
programa deve calcular a média alcançada por aluno e presentar:
. A mensagem "Aprovado", se a média for maior ou igual a 7,
com a respectiva média alcançada;
a. A mensagem "Reprovado", se a média for menor do que 7, com
a respectiva média alcançada;
b. A mensagem "Aprovado com Distinção", se a média for igual a
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
            System.out.println("Aprovado com Distinção! média = "+media);
        } else if (media >= 7) {
            System.out.println("Aprovado! média = "+media);
        } else {
            System.out.println("Reprovado! média "+media);
        }


    }
}
