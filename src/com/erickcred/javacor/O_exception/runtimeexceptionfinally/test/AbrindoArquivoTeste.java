package com.erickcred.javacor.O_exception.runtimeexceptionfinally.test;

import java.io.File;
import java.io.IOException;

public class AbrindoArquivoTeste {

    public static void main(String[] args) {
        try {
            abrirArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void abrirArquivo() throws IOException {
        File file = new File("teste.doc");
        try {
            System.out.println("Abrindo o arquivo" + file.getAbsolutePath());
            throw new Exception("erro");
            //System.out.println("executando a leitura do arquivo\nEscrevendo no arquivo");
        } catch (Exception e) {
            System.out.println("Dentro do catch:");
            e.printStackTrace();
        } finally {
            System.out.println("Finalizado o arquvo: " + file.getName());
        }
    }
    // Indo para
    // https://www.youtube.com/watch?v=IL0-EWlytzA&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=73&ab_channel=DevDojo

}
