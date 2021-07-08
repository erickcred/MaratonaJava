package com.erickcred.introducao.variaveis;

/**
 * Crie um algoritimo que possua variavis para salvar
 * os seguintes dados:
 * Nome, Endereço e o Telefone de uma pessoa
 * Imprima essas variaveis da seguinte forma
 * O <nome> domiciliado no endereço <endereco> e telefone <telefone>
 * não possui nenhum tipo de pendencia
 */

public class RelatorioPendencia {
    public static void main(String[] args) {
        String nome = "Erick";
        String endereco = "Rua tal, 444";
        String telefone = "41 9 9999-999";

        System.out.println("O "+ nome +" domiciliado no endereço " + endereco
        +" \ne telefone "+ telefone +" não possui nenhuma pendencia!");
    }
}
