package com.erickcred.javacor.F_modificadorestatico.classes;

public class Carro {

    // Velocidade limite deve ser de 240Km/h
    private String marca;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro() {}
    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
//        if (this.velocidadeMaxima > getVelocidadeLimite()) return getVelocidadeLimite();
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void carroDados() {
        System.out.println(
                "------------------------\n" +
                "Marca/Modelo: " + this.marca
                +"\nVelocidade Maxima: " + this.velocidadeMaxima
                +"\nVelocidade Limite: " + velocidadeLimite + "\n------------------------"
        );
    }
}
