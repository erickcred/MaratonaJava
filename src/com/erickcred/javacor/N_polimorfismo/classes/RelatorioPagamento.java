package com.erickcred.javacor.N_polimorfismo.classes;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

public class RelatorioPagamento {
    DecimalFormat dinheiro = new DecimalFormat("R$ #,###.00");

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println("Relatório de Pagamentos Gerencia:");
//        gerente.calculaPagamento();
//        System.out.println("Nome: " + gerente.getNome() + " - " + dinheiro.format(gerente.getSalario()));
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//        System.out.println("Relatório de Pagamentos Vendedores:");
//        vendedor.calculaPagamento();
//        System.out.println("Nome: " + vendedor.getNome() + " - " + dinheiro.format(vendedor.getSalario()));
//    }
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de Pagamento!");
        funcionario.calculaPagamento();
        System.out.println("Nome: " + funcionario.getNome() + " - " + dinheiro.format(funcionario.getSalario()));

        if (funcionario instanceof Gerente) {
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participação nos Lucros: " + dinheiro.format(gerente.getPlr()));
        } else if (funcionario instanceof Vendedor) {
            // Parametros Polimorficos
            System.out.println("Total Vendas: " + dinheiro.format( (((Vendedor) funcionario).getTotalVendas()) ));
        }
        System.out.println("----------------------");
    }
}
