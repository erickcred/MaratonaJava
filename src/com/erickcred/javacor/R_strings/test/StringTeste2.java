package com.erickcred.javacor.R_strings.test;

public class StringTeste2 {
    public static void main(String[] args) {
        String nome = "Erick";
        nome = nome.concat(" Rick");

        String teste = "  Goku";
        String teste2 = "goku";

        System.out.println(teste.charAt(1)); // para poder pegar o valor dentro do index informado
        System.out.println(teste.equals(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('o', 'a'));
        System.out.println(teste.toLowerCase() + "\n" + teste.toUpperCase());
        System.out.println(teste.substring(1)); // ele vai pegar apartir do index informado
        System.out.println(teste.substring(0, 2)); // ele vai pegar do index ate valor -1
        System.out.println(teste.trim()); // Remove todos os espaços do inicio e do fim


    }
}
