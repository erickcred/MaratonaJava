package com.erickcred.javacor.C_sobrecargametodos.classes;

import java.text.DecimalFormat;

public class Funcionario {
    DecimalFormat salarioFormatado = new DecimalFormat("R$ #,###.00");

    private String nome;
    private String cpf;
    private String rg;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public Funcionario(String nome, String cpf, String rg, double salario) {
        this(nome, cpf, salario);
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        try {
            return this.cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        } catch (NullPointerException npe) {
            this.cpf = "|=>* Documento não cadastrado *<=| ";
            return this.cpf;
        }
    }

    public String getRg() {
        try {
            return this.rg.replaceAll("(\\d{1})(\\d{3})(\\d{3})(\\d{1})", "$1.$2.$3-$4");
        } catch (NullPointerException npe) {
            this.rg = "|=>* Documento não cadastrado *<=| ";
            return this.rg;
        }
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    private String salarioFormatado() {
        return salarioFormatado.format(getSalario());
    }

    public void funcionarioDados() {
        System.out.println(
                "Nome: " + getNome() + " - CPF: " + getCpf() + " - RG: " + getRg()
                +"\nSalario: " + salarioFormatado() + "\n"
        );
    }
}
