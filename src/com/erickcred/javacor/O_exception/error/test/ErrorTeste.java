package com.erickcred.javacor.O_exception.error.test;

public class ErrorTeste {

    public static void main(String [] args) {
        stackOverflowError();
    }

    public static void stackOverflowError() {
        // Realizando erro de recursividade
        stackOverflowError();

        // O que é um Stack? Pilha de chamadas
    }
}
