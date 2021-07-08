package com.erickcred.introducao.operadores;

public class OperadoresDeAtribuicao {

    public static void main(String[] args) {
        int salario = 1800;
        System.out.println(salario);
        salario += 100;
        System.out.println(salario);
        salario = salario + (int)(salario * 0.10);
        System.out.println(salario);
    }
}
