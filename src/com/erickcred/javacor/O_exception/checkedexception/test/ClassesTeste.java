package com.erickcred.javacor.O_exception.checkedexception.test;

import com.erickcred.javacor.O_exception.customexception.classes.Leitor1;
import com.erickcred.javacor.O_exception.customexception.classes.Leitor2;

public class ClassesTeste {

    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
