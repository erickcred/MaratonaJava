package com.erickcred.javacor.H_heranca.classes;

public abstract class Endereco {

    private String rua;
    private String bairro;

    public Endereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }
    public Endereco() {}

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public void print() {
        System.out.println(
                "-Endereco-" +
                "\nRua:" + getRua() +
                " Bairro: " + getBairro()
        );
    }
}
