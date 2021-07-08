package com.erickcred.javacor.A_introducaoclasses.classes;

public class Estudante {
    private String nome;
    private Integer idade;
    private String matricula;

    public Estudante (String nome, Integer idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nMatricula: " + getMatricula();
    }
}
