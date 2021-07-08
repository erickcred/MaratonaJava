package com.erickcred.javacor.F_modificadorestatico.classes;

public class Cliente {
    /*
        0 - Bloco de inicialização static é executado quando a JVM carrega a classe (é executado apenas 1 vez)
        1 - Alocado espaço na memoria para o objeto que será criado
        2 - Cada atributo de classe é criado e inicializado com seus calores default ou valores explicitos
        3 - Bloco de inicilização é executado
        4 - O contrutor é executado
     */

    private static int[] parcelas;

    static {
        System.out.println("bloco de inicialização");
        Cliente.parcelas = new int[100];
        for (int i = 1; i < parcelas.length; ++i) {
            parcelas[i] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return Cliente.parcelas;
    }
    public static void setParcelas(int... parcelas) {
        Cliente.parcelas = parcelas;
        for (int i = 1; i < parcelas.length; i++) {
            parcelas[i] = i;
        }
    }
}
