package com.abms.javabasico.aula13;

public class CurtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; // analisa o primeiro argumento e o segundo
        boolean resultado2 = falso && verdadeiro; // analisa o primeiro argumento,
                                                  // como � falso n�o analisa o segundo arguemnto,
                                                  // pois � irrelevante

        // o resultado � o mesmo
        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}
