package com.erickcred.javacor.L_classesabstratas.classes;

public abstract class Funcionario extends Pessoa {
    protected String clr;
    protected double salario;

    public Funcionario() {}
    public Funcionario(String nome, String clr, double salario) {
        this.nome = nome;
        this.clr = clr;
        this.salario = salario;
    }

    public String getClr() {
        return this.clr;
    }

    public void setClr(String clr) {
        this.clr = clr;
    }

    public abstract void calculaSalario();

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime() {
        System.out.println("Dentro do imprime de Funcionário");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clr='" + clr + '\'' +
                ", salario=" + salario +
                '}';
    }
}
