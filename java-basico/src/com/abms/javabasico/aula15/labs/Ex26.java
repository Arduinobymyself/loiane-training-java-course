/*
Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, G-
gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        System.out.println("=== POSTOS TABAJARA ===");
        System.out.println("=== Bem vindo!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Com qual combustível deseja abastecer? \n(G) - Gasolina\n(A) - Álcool");
        String combustivel = scan.next();
        System.out.println("Quantos litros deseja colocar?");
        int litros = scan.nextInt();
        int descontoAlcool;
        int descontoGasolina;
        double precoAlcool = 4.549;
        double precoGasolina = 6.932;
        double totalAlcool;
        double totalGasolina;
        double totalAlcoolDesconto;
        double totalGasolinaDesconto;


        if (combustivel.equalsIgnoreCase("A")){
            if (litros >= 20){
                descontoAlcool = 5;
            }else {
                descontoAlcool = 3;
            }
            totalAlcool = litros * precoAlcool;
            totalAlcoolDesconto = totalAlcool - (totalAlcool * descontoAlcool / 100);
            System.out.println("Combustível\t\t\t: "+ combustivel.toUpperCase());
            System.out.println("Total de Litros:\t: "+litros);
            System.out.println("Total sem desconto\t: "+ totalAlcool);
            System.out.println("Total com desconto\t: "+totalAlcoolDesconto);
        }

        if (combustivel.equalsIgnoreCase("G")){
            if (litros >= 20){
                descontoGasolina = 6;
            }else {
                descontoGasolina = 4;
            }
            totalGasolina = litros * precoGasolina;
            totalGasolinaDesconto = totalGasolina - (totalGasolina * descontoGasolina / 100);
            System.out.println("Combustível\t\t\t: "+ combustivel.toUpperCase());
            System.out.println("Total de Litros:\t: "+litros);
            System.out.println("Total sem desconto\t: "+ totalGasolina);
            System.out.println("Total com desconto\t: "+totalGasolinaDesconto);
        }




    }
}
