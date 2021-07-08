package com.erickcred.introducao.arrays;

public class Arrays2 {

    public static void main(String[] args) {
        /* Valores padrão para variaveis
            byte, short, int, long, float, double = 0
            char ='\u0000', ' ''
            boolean = false
            referenc = null
         */
        String[] nomes = new String[3];
        nomes[0] = "Erick";
        nomes[1] = "Jessica";
        nomes[2] = "Maily";

        System.out.println("idade 1: " + nomes[0]);
        System.out.println("idade 2: " + nomes[1]);
        System.out.println("idade 3: " + nomes[2]);
    }
}
