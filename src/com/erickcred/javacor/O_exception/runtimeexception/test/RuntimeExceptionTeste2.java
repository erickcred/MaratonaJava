package com.erickcred.javacor.O_exception.runtimeexception.test;

public class RuntimeExceptionTeste2 {

    public static void main(String[] args) {
        try {
            divisao(10, 0);
        } catch(RuntimeException e) {
            System.out.println("\n-------------\n" + e.getMessage() + "\n-------------\n");
            e.printStackTrace();
        }
    }

    private static void divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de " + num2 + " para (num2).");
        }
        int calc = num1 / num2;
        System.out.println(calc);
    }
}
