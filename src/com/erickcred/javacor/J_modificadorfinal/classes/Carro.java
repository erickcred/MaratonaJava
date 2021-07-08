package com.erickcred.javacor.J_modificadorfinal.classes;

public class Carro {

    private String nome;
    private String marca;
    public  static final double VELOCIDADE_LIMITE = 250;

    private final Comprador comprador = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }

    public Comprador getComprador() {
        return comprador;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
