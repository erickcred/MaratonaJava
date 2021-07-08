package com.erickcred.introducao.controlefluxo;

import java.text.DecimalFormat;

public class ControleFluxo4 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$ #,###.00");
        /*
            Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
            porem as parcelas não pode ser menores do que 1000
         */
        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println(df.format(valorCarro) + " = " + parcela + " x " + df.format(valorParcela));
        }
    }
}
