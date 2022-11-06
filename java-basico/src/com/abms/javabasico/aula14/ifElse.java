package com.abms.javabasico.aula14;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        //exemplo comparar idade
        System.out.println("Entre com a sua idade: ");
        int idade = scan.nextInt();

        if(idade >= 18) {
            System.out.println("É maior de idade");
        }else{
            System.out.println("Não é maior de idade");
        }
         */

        // exemplo comprar produto
        // valor <= 10 - barato
        // 10 < valor < 15 - pedir desconto
        // 15 <= valor < 17 - pesquisar mais
        // valor >= 17 - muito caro

        System.out.println("Entre com o preço do produto: ");
        double valor = scan.nextDouble();
        if (valor <= 10){
            System.out.println("está barato, pode comprar!");
        }else if(valor > 10 && valor < 15){
            System.out.println("Voce pode pedir um desconto.");
        } else if(valor >= 15 && valor < 17){
            System.out.println("Pesquise mais!");
        }else {
            System.out.println("Está muito caro, não compre!");
        }
    }
}
