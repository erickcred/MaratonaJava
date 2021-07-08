package com.erickcred.introducao.controlefluxo;

import java.text.DecimalFormat;

public class ControleFluxo5 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$ #,###.00");
        double valorCarro = 30000;

        for (int parcela = (int)valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(df.format(valorCarro) + " = " + parcela + " x " + df.format(valorParcela));

        }
    }
}
