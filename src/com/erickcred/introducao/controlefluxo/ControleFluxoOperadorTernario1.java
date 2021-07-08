package com.erickcred.introducao.controlefluxo;

public class ControleFluxoOperadorTernario1 {

    public static void main(String[] args) {
        int idade = 18;
        String status = (idade >= 18) ? "Adulto" : "Não adulto";

        System.out.println(status);
    }
}
