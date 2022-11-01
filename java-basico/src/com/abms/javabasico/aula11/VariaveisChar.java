package com.abms.javabasico.aula11;

public class VariaveisChar {
    public static void main(String[] args) {
        char i = 'i'; //111
        char o = 'o'; //105
        char interrogacao = 0x003F;
        System.out.println(o + i); //216
        System.out.println("" + o + i); //oi
        System.out.println("" + o + i + interrogacao); //oi?


    }
}
