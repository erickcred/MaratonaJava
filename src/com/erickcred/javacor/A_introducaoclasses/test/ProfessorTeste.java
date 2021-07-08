package com.erickcred.javacor.A_introducaoclasses.test;

import com.erickcred.javacor.A_introducaoclasses.classes.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {
        Professor pf = new Professor();

        pf.setNome("Eveline");
        pf.setMatricula("A123");
        pf.setCpf("00000000000");
        pf.setRg("99999999");

        pf.dados();

        // resolvendo https://www.youtube.com/watch?v=BNYNM5hhDHw&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=27&ab_channel=DevDojo
    }
}
