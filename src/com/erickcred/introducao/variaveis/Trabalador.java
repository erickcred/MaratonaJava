package com.erickcred.introducao.variaveis;

/**
 * Crie um algoritimo que possua variavis Nome Salario, sexo (M, F)
 * idade e estado civil
 * Imprima da seguinte forma:
 * O trabalhador(a) <nome> do sexo <sexo>, idade <idade>, estado civil
 * <estadoCivil> e salario <salario>, encontra-se empregado neste
 * estabelecimento.
 */

public class Trabalador {
    public static void main(String[] args) {
        String nome = "Goku";
        char sexo = 'M';
        int idade = 34;
        double salario = 1500.50;
        String estadoCivil = "Casado";

        System.out.println("O trabalhador " + nome + " so sexo " + sexo
        + " idade " + idade + ", estado civil " + estadoCivil
        + "\ne salario " + salario + " encontra-se empregado neste estabelecimento");
    }
}
