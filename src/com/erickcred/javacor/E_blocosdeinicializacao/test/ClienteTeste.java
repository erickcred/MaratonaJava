package com.erickcred.javacor.E_blocosdeinicializacao.test;

import com.erickcred.javacor.E_blocosdeinicializacao.classes.Cliente;

public class ClienteTeste {

    public static void main(String[] args) {
        Cliente cl = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possíveis!");
        for (int parcela : cl.getParcelas()) {
            System.out.print((parcela + 1) + " x, ");
        }
    }
}
