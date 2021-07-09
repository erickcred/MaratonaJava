package com.erickcred.javacor.N_polimorfismo.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return this.totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaPagamento() {
        this.salario = this.salario + (this.totalVendas * 0.05);
    }
}
