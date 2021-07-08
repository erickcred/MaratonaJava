package com.erickcred.javacor.G_associacao.test;

import com.erickcred.javacor.G_associacao.classes.Aluno;
import com.erickcred.javacor.G_associacao.classes.Local;
import com.erickcred.javacor.G_associacao.classes.Professor;
import com.erickcred.javacor.G_associacao.classes.Seminario;

public class MainSeminario {

    public static void main(String[] args) {
        Seminario sem = new Seminario("Virado no Jiraya");
        Seminario sem1 = new Seminario("Logica de Programação");

        Local local = new Local("Amelias", "Jardins");

        Professor p = new Professor("Eveline", "Português");

        Aluno a = new Aluno("Erick", 34);
        Aluno a1 = new Aluno("Jessica", 29);

        sem.setProfessor(p);
        sem.setAlunos(a);
        sem.setLocal(local);
        sem1.setProfessor(p);
        sem1.setAlunos(a1);
        sem1.setLocal(local);

        p.setSeminarios(sem, sem1);

        a.setSeminario(sem);
        a1.setSeminario(sem1);

        sem.print();
        sem1.print();
        System.out.println("Alunos:");
        a.print();
        a1.print();

        System.out.println("\n");
        p.print();

    }
}
