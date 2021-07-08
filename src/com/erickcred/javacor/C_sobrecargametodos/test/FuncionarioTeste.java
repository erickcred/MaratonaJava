package com.erickcred.javacor.C_sobrecargametodos.test;

import com.erickcred.javacor.C_sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario f1 =  new Funcionario("Erick", "09812355923", 1890.64);
        Funcionario f2 = new Funcionario("Fulano", "12343255566", "12348769", 5500.50);

        f1.funcionarioDados();
        f2.funcionarioDados();

    }
}
