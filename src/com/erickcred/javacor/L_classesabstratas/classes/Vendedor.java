package com.erickcred.javacor.L_classesabstratas.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clr, double salario, double totalVendas) {
        super(nome, clr, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return this.totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (this.totalVendas * 0.05);
    }

    @Override
    public void imprime() {
        System.out.println("Dentro do imprime Vendedor");
    }
}
