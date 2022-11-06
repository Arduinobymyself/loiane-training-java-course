/*
 Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno você estuda?");
        System.out.println("M - matutino\nV - Vespertino \nN - noturno\n:");
        String turno = scan.next().toUpperCase();
        switch(turno){
            case ("M"):
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Entre a informação corretamente!");
                break;
        }

    }
}
