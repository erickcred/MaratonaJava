package com.erickcred.javacor.B_introducaometodos.test;

import com.erickcred.javacor.B_introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subitraiDoisNumeros();
        calc.multiplicaDoisNumeros(5, 5);
        System.out.println(calc.divideDoisNumeros(20, 1));
        calc.imprimeDoisNumerosDivididos(10, 0);

        int[] soma = {100, 10, 100};
        calc.somaArray(soma);

        calc.somaVarArgs(1, 1, 1, 1);
    }
}