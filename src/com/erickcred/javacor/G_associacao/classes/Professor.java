package com.erickcred.javacor.G_associacao.classes;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    private Seminario[] getSeminarios() {
        return this.seminarios;
    }
    public void setSeminarios(Seminario... seminarios) {
        this.seminarios = seminarios;
    }

    public void retornaSeminarios() {
        System.out.println("Seminarios:");
        try {
            for (Seminario s : getSeminarios()) {
                System.out.print("{" + s.getTitulo() + "}, ");
            }
        } catch (Exception e) {
            System.out.println("Sem Seminários cadastrados!");
        }
//        return null;
    }

    public void print() {
        System.out.println("Professor: \nNome: " + getNome() + " - Especialidade: " + getEspecialidade());
        retornaSeminarios();
    }
}
