package com.erickcred.javacor.O_exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckExceptionTeste {

    public static void main(String[] args) throws IOException {
        criandoArquivo1();
        System.out.println("-----------------------------");
        try {
            criandoArquivo();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void criandoArquivo() throws IOException {
        File file = new File("C:\\Users\\erick\\Área de Trabalho\\Teste.pdf");
            System.out.println("Arquivo já existe");
            System.out.println("Arquivo criado?: " + file.createNewFile());
    }

    public static void criandoArquivo1() throws IOException {
        // Lançando excesão propria
        File file = new File("C:\\Users\\erick\\Área de Trabalho\\Teste.pdf");
        try {
            System.out.println("Arquivo já existe");
            System.out.println("Arquivo criado?: " + file.createNewFile());
        } catch(IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
