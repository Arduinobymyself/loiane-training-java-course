/*
Faça um porgrama que peça um número e então mostre a mensagem
"O número informado foi: [numnero]"
 */

package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);

    }
}
