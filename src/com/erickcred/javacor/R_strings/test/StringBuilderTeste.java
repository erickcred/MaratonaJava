package com.erickcred.javacor.R_strings.test;

public class StringBuilderTeste {

    public static void main(String[] args) {
        String s = "Uma frase comum";
//        StringBuilder = s; // StringBuilder não é uma String por isso não pode ser feito esse tipo de associação
        StringBuilder sb = new StringBuilder(16); // é a capacidade maxima do StringBuilder
        sb.append("Uma frase comum");
        sb.append(" teste");
        System.out.println(sb);
//        System.out.println(sb.reverse());
        sb.delete(0, 2);
        System.out.println(sb);
        sb.insert(0, "m");
        System.out.println(sb);
    }
}
