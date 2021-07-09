package com.erickcred.javacor.M_interfaces.classes;

public class Produto implements ITributavel, ITrasnportavel {

    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return this.precoFinal;
    }

    private double getPrecoFinalIF() {
        return getPrecoFinal() + getValorFrete();
    }

    public double getValorFrete() {
        return this.valorFrete;
    }

    @Override
    public void calcularImposto() {
        this.precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / this.peso * 0.1;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", peso=" + getPeso() +
                "\npreco=" + getPreco() +
                "\nprecoFinal com Imposto sem Frete=" + getPrecoFinal() +
                "\nprecoFinal com emcargos=" + getPrecoFinalIF() +
                "\nvalorFrete=" + valorFrete +
                '}';
    }
}