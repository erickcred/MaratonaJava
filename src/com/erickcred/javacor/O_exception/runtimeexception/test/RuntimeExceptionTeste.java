package com.erickcred.javacor.O_exception.runtimeexception.test;

public class RuntimeExceptionTeste {

    public static void main(String[] args) {
        /*
            ArithmeticException
                * Acontece quando se tenta dividir um numero inteiro por zero
         */

        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (RuntimeException e) {
            System.out.println("Causa: " + e.getCause() + "\nMensagem: " + e.getMessage());
        }

    }
}
