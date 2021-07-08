package com.erickcred.introducao.arrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Informa a idade " + (i+1) + ": ");
            idades[i] = sc.nextInt();
        }

        for (int i : idades) {
            System.out.println(i);
        }
    }
}
