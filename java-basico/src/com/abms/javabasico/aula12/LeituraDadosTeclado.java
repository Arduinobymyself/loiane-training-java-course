package com.abms.javabasico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo �: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome �: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("A sua idade �: " + idade);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua idade �: " + altura);
        */

        System.out.println("Digite seu primiero nome, idade, qtde filhos, altura e bicho de estima��o?:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdeFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Voc� digitoru os seguintes dados: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Qantidade de filhos: " +qtdeFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Bicho de estima��o? " + temPet);









    }
}
