/*
Um posto est� vendendo combust�veis com a seguinte tabela de
descontos:
. �lcool:
a. at� 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. at� 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o n�mero de litros vendidos, o tipo de
combust�vel (codificado da seguinte forma: A-�lcool, G-
gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o
do litro do �lcool � R$ 1,90.
 */


package com.abms.javabasico.aula15.labs;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        System.out.println("=== POSTOS TABAJARA ===");
        System.out.println("=== Bem vindo!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Com qual combust�vel deseja abastecer? \n(G) - Gasolina\n(A) - �lcool");
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
            System.out.println("Combust�vel\t\t\t: "+ combustivel.toUpperCase());
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
            System.out.println("Combust�vel\t\t\t: "+ combustivel.toUpperCase());
            System.out.println("Total de Litros:\t: "+litros);
            System.out.println("Total sem desconto\t: "+ totalGasolina);
            System.out.println("Total com desconto\t: "+totalGasolinaDesconto);
        }




    }
}
