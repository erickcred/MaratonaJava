package com.erickcred.javacor.L_classesabstratas.classes;

public abstract class Pessoa {

    protected String nome;

    public abstract void imprime();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
