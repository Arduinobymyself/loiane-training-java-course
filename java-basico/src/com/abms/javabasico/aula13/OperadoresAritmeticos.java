package com.abms.javabasico.aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado -1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Marcelo";
        String segundoNome = "Moraes";

        String nomeCompleto = primeiroNome + " " + segundoNome;
        System.out.println(nomeCompleto);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado); // 5

        System.out.println(resultado++); // 5 primeiro mostra o resultado 5 e depois incrementa para 6(pós fixado)
        // o mesmo que:
        // System.out.println(resultado);
        // resultado = resultado + 1;

        System.out.println(++resultado); // 7 primeiro incrementa para 7 e deposi mostra o resultado 7
        // o mesmo que:
        // resultado = resultado + 1;
        // System.out.println(resultado);

        // semelhantemente......
        resultado--;
        System.out.println(resultado); // 6
        System.out.println(resultado--); // 6
        System.out.println(--resultado); // 4









    }
}
