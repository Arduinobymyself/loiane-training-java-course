/*
Fa�a um Programa que verifique se uma letra digitada � vogal ou
consoante
 */



package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma letra: ");
        String letra = scan.next();

        if(letra.length() > 1){
            System.out.println("Inv�lido, digite apenas uma letra!");
        }else {
            if("aeiouAEIOU".contains(letra)){
                System.out.println("Vogal");
            }else{
                System.out.println("Consoante");
            }
        }





    }
}
