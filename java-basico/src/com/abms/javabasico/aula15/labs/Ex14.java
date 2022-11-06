/*
 Fa�a um programa que l� as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua m�dia. A
atribui��o de conceitos obedece � tabela abaixo:
o
M�dia de Aproveitamento Conceito
o
Entre 9.0 e 10.0 A
o
Entre 7.5 e 9.0 B
o
Entre 6.0 e 7.5 C
o
Entre 4.0 e 6.0 D
o
Entre 4.0 e zero E
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre a primiera nota (n1): ");
        double nota1 = scan.nextInt();
        System.out.println("Entre a segunda nota (n2): ");
        double nota2 = scan.nextInt();

        double media = (nota1 + nota2) / 2;

        if(media >= 9){
            System.out.println("Nota 1: "+nota1+" Nota 2: "+nota2+" M�dia: "+media+" Conceito: A, Aprovado!");
        } else if (media >= 7.5) {
            System.out.println("Nota 1: "+nota1+" Nota 2: "+nota2+" M�dia: "+media+" Conceito: B, Aprovado!");
        } else if (media >= 6) {
            System.out.println("Nota 1: "+nota1+" Nota 2: "+nota2+" M�dia: "+media+" Conceito: C, Aprovado!");
        } else if (media >= 4) {
            System.out.println("Nota 1: "+nota1+" Nota 2: "+nota2+" M�dia: "+media+" Conceito: D, Reprovado!");
        }else {
            System.out.println("Nota 1: "+nota1+" Nota 2: "+nota2+" M�dia: "+media+" Conceito: E, Reprovado!");
        }

    }
}
