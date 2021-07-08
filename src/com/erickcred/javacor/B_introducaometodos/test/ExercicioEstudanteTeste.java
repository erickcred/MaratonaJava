package com.erickcred.javacor.B_introducaometodos.test;

import com.erickcred.javacor.B_introducaometodos.classes.ExercicioEstudante;

public class ExercicioEstudanteTeste {

    public static void main(String[] args) {
        ExercicioEstudante ee = new ExercicioEstudante();

        ee.setNome("Erick Rick");
        ee.setIdade(10);
        ee.setNotas(7, 4, 10);

        System.out.println("Idade: " + ee.getIdade());

        ee.dados();
    }
}
