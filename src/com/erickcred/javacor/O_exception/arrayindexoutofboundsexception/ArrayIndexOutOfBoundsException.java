package com.erickcred.javacor.O_exception.arrayindexoutofboundsexception;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        /*
            Esse erro acontece quando é tentado acessar uma posição do array que não existe;
            Esse seria um erro de desenvolvimento
         */
        try {
            int[] a = new int[2];
            System.out.println(a[2]);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("----");
            System.out.println(e.getMessage());
        }
    }
}
// Indo para
// https://www.youtube.com/watch?v=YzoQMLfY7-c&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=71&ab_channel=DevDojo