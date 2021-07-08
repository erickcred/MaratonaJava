package com.erickcred.javacor.B_introducaometodos.test;

import com.erickcred.javacor.B_introducaometodos.classes.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {
        Professor prof = new Professor();
        Professor prof2 = new Professor();

        prof.setNome("Okada");
        prof.setMatricula("AS123");
        prof.setCpf("00000000000");
        prof.setRg("99999999");

        prof2.setNome("Erick");
        prof2.setMatricula("BS123");
        prof2.setCpf("00000000000");
        prof2.setRg("99999999");

        prof.dados();
        prof2.dados();
    }
}
