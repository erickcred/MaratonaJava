package com.erickcred.javacor.H_heranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, String cpf, String rua, String bairro) {
        super(nome, cpf, rua, bairro);
    }
    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + getNome() + " recebi o pagamento de " + this.salario);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Salario: " + getSalario());

    }
}
