package com.erickcred.introducao.controlefluxo;

public class ControleFluxo {

    public static void main(String[] args) {
        // idade < 15 categoria infaltil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 18;
        float salario = 2000f;
        String categoria = "Categoria ";

        if (idade < 15) {
            categoria += "Infaltil";
        } else if (idade >= 15 && idade < 18) {
            categoria += "Juvenil!";
        } else {
            categoria += "Adulto";
        }
        System.out.println(categoria);
    }
}
