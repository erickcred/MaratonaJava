package com.erickcred.javacor.R_strings.test;

public class StringTeste {

    public static void main(String[] args) {
        // String no java são imutaveis
        String nome = "Erick";
//        String sobrenome = new String(" Rick");
//        nome += " Rick";
//        nome.concat(" Rick"); // Ira imprimir somente a variavel nome pois é a referencia
        nome = nome.concat(" Rick"); // nesse caso ele vai imprimir tudo pois estamos referenciando a variavel (nome + concat)

        System.out.println(nome);
    }
}
