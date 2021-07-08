package com.erickcred.javacor.J_modificadorfinal.test;

import com.erickcred.javacor.J_modificadorfinal.classes.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.setMarca("For Ka");
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
    }
}
