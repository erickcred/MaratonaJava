package com.erickcred.javacor.R_strings.test;

public class StringPerformanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + ((fim - inicio)) + " ms");

        System.out.println("Auta Performance StringBuilder");
        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + " ms");

        System.out.println("Auta Performance StringBuffer");
        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + " ms");
    }

    private static void concatString(int tamanho) {
        String string = "";

        for (int i = 0; i < tamanho; i++) {
            string += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
