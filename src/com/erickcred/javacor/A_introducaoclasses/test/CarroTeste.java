package com.erickcred.javacor.A_introducaoclasses.test;

import com.erickcred.javacor.A_introducaoclasses.classes.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "KA", "Vermelho");
        carro.setPlaca("A122J123");
        carro.setVelocidadeMaxima(200f);

        carro.dadosCarro();
    }
}
