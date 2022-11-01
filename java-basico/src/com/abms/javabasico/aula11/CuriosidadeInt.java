package com.abms.javabasico.aula11;

public class CuriosidadeInt {
    public static void main(String[] args) {
        int  numero1 = 2147483647; // valor máximo para um inteiro
        int  numero2 = 1;

        // o que acontece se somarmos 1 ao numero1
        System.out.println(numero1 + numero2); //-2147483648 o máximo valor negativo
    }
}
