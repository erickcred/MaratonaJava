package com.erickcred.javacor.F_modificadorestatico.test;

import com.erickcred.javacor.F_modificadorestatico.classes.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro c = new Carro("For Ka", 250);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);

        c.carroDados();
        c1.carroDados();
        c2.carroDados();

        System.out.println("###################");

        c.carroDados();
        c1.carroDados();
        c2.carroDados();
    }
}
