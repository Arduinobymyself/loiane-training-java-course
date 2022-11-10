package com.abms.javabasico.aula16;

public class LoopFor {
    public static void main(String[] args) {

        System.out.println("Contando de 1 a 10");
        for(int i = 1; i <= 10; i++){
            System.out.print(i+", ");
        }

        System.out.println("\nContando de 10 a 1");
        for(int i = 10; i >= 1; i--){
            System.out.print(i+", ");
        }

        System.out.println("\nContagem dupla");
        for(int i=0, j=10; i<j; i++, j--){
            System.out.println("i tem valor: "+i+" e j tem valor: "+j);
        }

        System.out.println("Contando de dois em dois até 10");
        int i = 0;
        for(; i <= 10;){
            System.out.println("i tem valor: "+i);
            i += 2;
        }

        System.out.println("Loop sem corpo:");
        int soma = 0;
        for (int k = 1; k < 5; soma += k++);
        System.out.println("O valor da soma é: "+soma);


    }
}
