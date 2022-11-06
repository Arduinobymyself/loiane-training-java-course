/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
 */


package com.abms.javabasico.aula15.labs;

import java.util.Objects;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("qual é o seu sexo [F / M]:");
        String sexo = scan.next();
        if(sexo.equalsIgnoreCase("M")){
            System.out.println("M - Masculino");
        }else if(sexo.equalsIgnoreCase("F")){
            System.out.println("F - Feminino");
        }else{
            System.out.println("Sexo inválido");
        }


    }
}
