package com.erickcred.javacor.G_associacao.classes;

public class Seminario {

    private String titulo;
    private Professor professor;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return this.professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {

        return this.alunos;
    }
    public void setAlunos(Aluno... aluno) {
        this.alunos = aluno;
    }

    public Local getLocal() {
        return this.local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }

    private void retornaAlunos() {
        try {
            for (Aluno aluno : getAlunos()) {
                System.out.print("{" + aluno.getNome() + "}, ");
            }
        } catch (Exception e) {
            System.out.println("Sem alunos cadastrados!");
        }
    }

    public void print() {
        System.out.println("Semiário:");
        System.out.print("Título: " + getTitulo());
        if (this.professor != null) {
            System.out.println("\nProfessor: " + getProfessor().getNome());
        } else {
            System.out.println("\nProfessor: {Seminário sem professor}");
        }
        retornaAlunos();
        try {
            System.out.print("Alunos: ");
            System.out.println("\nLocal: " + getLocal().getRua() + " - " + getLocal().getBairro() + "\n");
        } catch(Exception e) {
            System.out.println("\nlocal: {Local não definido}\n");
        }
    }
}
