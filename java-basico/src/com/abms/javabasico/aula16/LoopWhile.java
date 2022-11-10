package com.abms.javabasico.aula16;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 1; // contador
        int max = 10;

        System.out.println("contando de " + i + " até "+max);

        while(i <= max){
            System.out.print(i+", ");
            i++;
        }
    }
}
