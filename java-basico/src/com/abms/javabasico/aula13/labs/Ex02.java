/*
Fa�a um porgrama que pe�a um n�mero e ent�o mostre a mensagem
"O n�mero informado foi: [numnero]"
 */

package com.abms.javabasico.aula13.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um n�mero: ");
        int numero = scan.nextInt();
        System.out.println("O n�mero informado foi: " + numero);

    }
}
