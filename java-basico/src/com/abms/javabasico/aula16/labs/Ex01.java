/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
 */


package com.abms.javabasico.aula16.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a nota (0 a 10): ");
        int nota = scan.nextInt();


        while(true){
            if (nota < 0 || nota > 10){
                System.out.println("Erro! \nNota inválida! \nEntre corretamente a nota!");
                nota = scan.nextInt();
            }else {
                break;
            }
        }
        System.out.println("A nota digita foi: "+nota);




    }
}
