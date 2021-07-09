package com.erickcred.javacor.M_interfaces.test;

import com.erickcred.javacor.M_interfaces.classes.Produto;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        p.calcularImposto();
        p.calculaFrete();

        System.out.println(p);
    }
}
