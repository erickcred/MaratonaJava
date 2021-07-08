package com.erickcred.javacor.L_classesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {}

    public Gerente(String nome, String clr, double salario) {
        super(nome, clr, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.2);
    }

}
