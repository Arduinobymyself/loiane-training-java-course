/*
Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um
crime. As perguntas s�o:
. "Telefonou para a v�tima?"
a. "Esteve no local do crime?"
b. "Mora perto da v�tima?"
c. "Devia para a v�tima?"
d. "J� trabalhou com a v�tima?" O programa deve no final emitir
uma classifica��o sobre a participa��o da pessoa no crime. Se
a pessoa responder positivamente a 2 quest�es ela deve ser
classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5
como "Assassino". Caso contr�rio, ele ser� classificado como
"Inocente"
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {

        System.out.println("=== DIT - Delegacia de Investiga��es Tabajara ===");
        System.out.println("=== Investiga��o Criminal ===");
        System.out.println("Responda (S) para sim ou (N) para n�o:");

        Scanner scan = new Scanner(System.in);

        int contador = 0;

        System.out.println("Telefonou para a v�tima?");
        String resposta1 = scan.next();
        if(resposta1.equalsIgnoreCase("S")) contador++;

        System.out.println("Esteve no local do crime?");
        String resposta2 = scan.next();
        if(resposta2.equalsIgnoreCase("S")) contador++;

        System.out.println("Mora perto da v�tima?");
        String resposta3 = scan.next();
        if(resposta3.equalsIgnoreCase("S")) contador++;

        System.out.println("J� trabalhou com a v�tima?");
        String resposta4 = scan.next();
        if(resposta4.equalsIgnoreCase("S")) contador++;

        System.out.println("Devia para a v�tima?");
        String resposta5 = scan.next();
        if(resposta5.equalsIgnoreCase("S")) contador++;


        if(contador == 5){
            System.out.println("Assassino!");
        } else if (contador >= 3) {
            System.out.println("C�mplice!");
        } else if (contador >= 2) {
            System.out.println("Suspeita!");
        }else {
            System.out.println("Liberada!");
        }


    }
}
