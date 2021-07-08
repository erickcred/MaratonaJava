package com.erickcred.javacor.F_modificadorestatico.test;


import com.erickcred.javacor.F_modificadorestatico.classes.Cliente;

public class ClienteTeste {

    public static void main(String[] args) {
        Cliente.setParcelas(new int[10]);
        Cliente cl = new Cliente();
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possíveis!");
        for (int parcela : cl.getParcelas()) {
            System.out.print((parcela + 1) + " x, ");
        }
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
    }
}
