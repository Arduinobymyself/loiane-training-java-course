/*
Tenho como dados de entrada a altura  e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal,
usando as seguintes fórmulas:
Para homens: (72.7 * altura) - 58
Para mulheres: (62.1 * altura) - 44.7
Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso
 */




package com.abms.javabasico.aula13.labs;

import java.util.Objects;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com sua altura (em metros): ");
        double altura = scan.nextDouble();
        System.out.println("Entre com seu peso (em Kilos): ");
        double peso = scan.nextDouble();
        System.out.println("Qual o seu sexo: (M/F)");
        String sexo = scan.next();

        double pesoIdealMasculino = (72.7 * altura) - 58;
        double pesoIdealFeminino = (62.1 * altura) - 44.7;

        if(Objects.equals(sexo, "M")){
            if(peso > pesoIdealMasculino){
                System.out.println("Você está acima do seu peso ideal " + pesoIdealMasculino + " Kg.");
            }else {
                System.out.println("Voce está abaixo do seu peso ideal " + pesoIdealMasculino + " Kg.");
            }
        }else{
            if(peso > pesoIdealFeminino){
                System.out.println("Você está acima do seu peso ideal " + pesoIdealFeminino + " Kg.");
            }else {
                System.out.println("Voce está abaixo do seu peso ideal " + pesoIdealFeminino + " Kg.");
            }

        }




    }
}
