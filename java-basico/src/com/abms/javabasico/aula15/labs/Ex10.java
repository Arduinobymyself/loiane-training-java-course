/*
 Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inv�lido!", conforme o caso.
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno voc� estuda?");
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
                System.out.println("Entre a informa��o corretamente!");
                break;
        }

    }
}
