/*
Fa�a um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou
igual a sete;
o A mensagem "Reprovado", se a m�dia for menor do que sete;
o A mensagem "Aprovado com Distin��o", se a m�dia for igual a
dez.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a nota n1: ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com a nota n2: ");
        double n2 = scan.nextDouble();

        double media = (n1 + n2) / 2;
        if(media == 10){
            System.out.println("Aprovado com Distin��o!");
        }else if(media >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

    }
}
