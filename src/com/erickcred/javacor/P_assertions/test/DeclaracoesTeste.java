package com.erickcred.javacor.P_assertions.test;

public class DeclaracoesTeste {
    // O assert deve ser habilitado

    public static void main(String[] args) {
        calculaSalario(-1000);
        diasDaSemana(9);
    }

    private static void calculaSalario(double salario) {
        double imposto = salario * 0.09;
        double salarioLiquedo = salario - imposto;

//        if (salario > 0) {
//            // Fazer calculo com salário
//            System.out.printf("Salario Liquedo: R$ %.2f ", salarioLiquedo);
//        } else {
//            System.out.println("Se cheou aqui, ferrou");
//        }

        // Forma correta para fazer
        assert (salario > 0);
        System.out.printf("Salario Liquedo: R$ %.2f ", salarioLiquedo);
    }

    public static void diasDaSemana(int dia) {
        switch (dia) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            default: assert false;
        }
    }
}
