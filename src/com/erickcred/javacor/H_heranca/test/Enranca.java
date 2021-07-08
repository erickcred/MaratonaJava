package com.erickcred.javacor.H_heranca.test;


import com.erickcred.javacor.H_heranca.classes.Funcionario;

public class Enranca {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Erick", "00000000000", 1889.50);
        f.setRua("margarida flores");
        f.setBairro("jovem");

        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        System.out.printf("R$%.2f", f.getSalario());
        System.out.println();
        System.out.println(f.getRua());
        System.out.println(f.getBairro());
        f.print();
        System.out.println();

        f.imprimeReciboPagamento();

    }
}
