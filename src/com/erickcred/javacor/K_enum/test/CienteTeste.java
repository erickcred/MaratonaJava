package com.erickcred.javacor.K_enum.test;

import com.erickcred.javacor.K_enum.classes.Cliente;
import com.erickcred.javacor.K_enum.classes.TipoCliente;

public class CienteTeste {

    public static void main(String[] args) {
        Cliente c = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA);

        System.out.println(c.toString());
    }
}
