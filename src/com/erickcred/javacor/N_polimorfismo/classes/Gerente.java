package com.erickcred.javacor.N_polimorfismo.classes;

public class Gerente extends Funcionario {

    private double plr;

    public Gerente(String nome, double salario, double participacaoLucro) {
        super(nome, salario);
        this.plr = participacaoLucro;
    }

    public double getPlr() {
        return this.plr;
    }

    public void setPlr(double plr) {
        this.plr = plr;
    }

    public void calculaPagamento() {
        this.salario = this.salario + this.plr;
    }
}