package com.erickcred.javacor.E_blocosdeinicializacao.classes;

public class Cliente {
    /*
        1 - Alocado espaço na memoria para o objeto que será criado
        2 - Cada atributo de classe é criado e inicializado com seus calores default ou valores explicitos
        3 - Bloco de inicilização é executado
        4 - O contrutor é executado
     */

    private int[] parcelas;

    {
        parcelas = new int[12];
        for (int i = 1; i < parcelas.length; ++i) {
            parcelas[i] = i;
        }
    }

    public Cliente() {
    }

    public int[] getParcelas() {
        return this.parcelas;
    }
    public void setParcelas(int... parcelas) {
        this.parcelas = parcelas;
    }
}
