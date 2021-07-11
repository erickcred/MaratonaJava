package com.erickcred.javacor.O_exception.checkedexception.test;

import java.io.*;

public class TrayWithResourcesTeste {

    public static void main(String[] args) {
        lerArquivo2();
    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\erick\\Área de Trabalho\\teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivo2() {
        try (Reader reader =  new BufferedReader(new FileReader("C:\\Users\\erick\\Área de Trabalho\\teste.txt")) ) {
            System.out.println("Lendo arquivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
