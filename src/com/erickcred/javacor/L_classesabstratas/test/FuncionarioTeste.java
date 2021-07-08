package com.erickcred.javacor.L_classesabstratas.test;

import com.erickcred.javacor.L_classesabstratas.classes.Gerente;
import com.erickcred.javacor.L_classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", "123-1123", 2000);
        Vendedor v = new Vendedor("Camila", "123-123", 1500, 5000);
        v.calculaSalario();
        g.calculaSalario();

        System.out.println(v);
        System.out.println(g);
    }
}
