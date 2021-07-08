package com.erickcred.javacor.A_introducaoclasses.classes;

/*
    Crie os seguintes astrubutos para essa classe
    Nome, Matricula, RG, CPF
    Depois crie uma classe de testes para preencher e imprimir os dados
 */

public class Professor {
    private String nome;
    private String matricula;
    private String rg;
    private String cpf;

    public Professor() {}

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return this.rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpfFormatado() {
        return getCpf().replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
    private String rgFormatado() {
        return getRg().replaceAll("(\\d{1})(\\d{3})(\\d{3})(\\d{1})", "$1.$2.$3-$4");
    }

    public void dados() {
        System.out.println(
                "Nome: " + getNome() + " - Matricula: " + getMatricula()
                +"\nRG: " + rgFormatado() + " - CPF: " + cpfFormatado()
        );
    }
}
