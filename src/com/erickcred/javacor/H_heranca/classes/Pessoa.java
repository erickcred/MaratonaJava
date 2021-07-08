package com.erickcred.javacor.H_heranca.classes;

public abstract class Pessoa extends Endereco {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa(String nome, String cpf, String rua, String bairro) {
        super(rua, bairro);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void print() {
        System.out.println(
                "Nome: " + getNome() + "\nCpf: " + getCpf()
        );
        super.print();

    }
}
