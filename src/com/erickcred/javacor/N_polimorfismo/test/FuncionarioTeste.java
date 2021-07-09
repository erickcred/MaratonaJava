package com.erickcred.javacor.N_polimorfismo.test;

import com.erickcred.javacor.N_polimorfismo.classes.Funcionario;
import com.erickcred.javacor.N_polimorfismo.classes.Gerente;
import com.erickcred.javacor.N_polimorfismo.classes.RelatorioPagamento;
import com.erickcred.javacor.N_polimorfismo.classes.Vendedor;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Gerente g = new Gerente("Jessica", 5000, 2000);
        Vendedor v = new Vendedor("Erick", 2000, 20000);

        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("-----------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
//        System.out.println("-----------------------");
        relatorio.relatorioPagamentoGenerico(v);

    }
}
