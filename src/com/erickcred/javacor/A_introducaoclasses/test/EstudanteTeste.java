package com.erickcred.javacor.A_introducaoclasses.test;

import com.erickcred.javacor.A_introducaoclasses.classes.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante estudante = new Estudante("Erick", 34, "A20123");

        System.out.println(estudante.toString());
    }
}
