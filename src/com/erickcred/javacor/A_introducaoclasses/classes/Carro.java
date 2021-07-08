package com.erickcred.javacor.A_introducaoclasses.classes;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private Float velocidadeMaxima;

    public Carro (String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public Float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void dadosCarro() {
        System.out.println(
                "Modelo: " + getModelo() + " - Marca: " + getMarca()
                +"\nCor: " + getCor() + " - Placa: " + getPlaca()
                +"\nVelocidade Maxima: " + getVelocidadeMaxima() + "Km"
        );
    }
}
