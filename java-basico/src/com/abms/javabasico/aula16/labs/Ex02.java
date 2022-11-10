/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
 */



package com.abms.javabasico.aula16.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = scan.next();
        System.out.println("Entre com uma senha: ");
        String senha = scan.next();

        while(true){
            if(nome.toLowerCase().equals(senha.toLowerCase())){
                System.out.println("Erro! \nA senha não pode ser igual ao nome! \nDigite uma senha forte!");
                senha = scan.next();
            }else{
                break;
            }

        }

        System.out.println("Seu username para login é: "+nome+" com a senha: "+senha);

    }
}
