package com.erickcred.javacor.D_sobrecargaconstrutores.test;

import com.erickcred.javacor.D_sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante es = new Estudante("Erick","A123");
        es.setNotas(5, 3, 5);

        Estudante es1 = new Estudante("Jessica", "A124", "10/05/2021 11:11");
        es1.setNotas(5, 3, 5);

        es.estudanteDados();
        es1.estudanteDados();
    }
}
