package com.erickcred.introducao.controlefluxo;

public class ExercicioControleFluxo2 {

    public static void main(String[] args) {
        /*
            Crie um switch que dado um valor de 1 a 7 considerando 1 domingo, imprima se é dia util ou final de semana
         */
        byte dia = 7;

        switch (dia) {
            case 1: case 7:
                System.out.println("Final de Semana");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Entrada Invalida");
        }
    }
}
