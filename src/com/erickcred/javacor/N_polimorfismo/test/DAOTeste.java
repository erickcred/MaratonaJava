package com.erickcred.javacor.N_polimorfismo.test;

import com.erickcred.javacor.N_polimorfismo.classes.ArquivoDAOImpl;
import com.erickcred.javacor.N_polimorfismo.classes.IDAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTeste {

    public static void main(String[] args) {
        IDAO arquivoDaoImpl = new ArquivoDAOImpl();
        arquivoDaoImpl.save();

        List<String> lista = new LinkedList<>();
        lista.add("Nome 1");
        lista.add("Nome 2");
        lista.add("Nome 3");
        lista.add("Nome 4");
        for (String l : lista) {
            System.out.println(l);
        }
    }
}
