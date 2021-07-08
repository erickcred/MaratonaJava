package com.erickcred.javacor.G_associacao.classes;

public class Aluno {

    private String nome;
    private int idade;

    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return this.seminario;
    }
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void print() {
        System.out.println("Nome: " + getNome() + " - Idade: " + getIdade());
        try {
            System.out.println("Seminario: {" + getSeminario().getTitulo() + "}");
        } catch (Exception e) {
            System.out.print("Seminário: {Sem seminarios cadastrado!}");
        }
    }
}
