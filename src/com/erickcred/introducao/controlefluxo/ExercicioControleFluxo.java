package com.erickcred.introducao.controlefluxo;

public class ExercicioControleFluxo {

    public static void main(String[] args) {
        /*
            Crie uma variáve salario e imprima seu imposto
            imposto:

            Salario < 1000 5%, Salario >= 1000 && Salario < 2000 10%
            Salario >= 2000 && Salario < 4000 15%
            Salario > 5000 20%
         */

        double salario = 5000;
        double totalImposto = 0;

        if (salario < 1000) {
            totalImposto  += salario * 0.5;
        } else if (salario >= 1000 && salario < 2000) {
            totalImposto  += salario * 0.10;
        } else if (salario >= 2000 && salario < 4000) {
            totalImposto += salario * 0.15;
        } else {
            totalImposto += salario * 0.20;
        }
        System.out.println(totalImposto);

    }
}
