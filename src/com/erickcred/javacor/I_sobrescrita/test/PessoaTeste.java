package com.erickcred.javacor.I_sobrescrita.test;

import com.erickcred.javacor.I_sobrescrita.classes.Pessoa;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina");
        p.setIdade(300);

        System.out.println(p);
    }
}
