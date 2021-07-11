package com.erickcred.javacor.O_exception.customexception.test;

import com.erickcred.javacor.O_exception.customexception.classes.Funcionario;
import com.erickcred.javacor.O_exception.customexception.classes.LoginInvalidoException;
import com.erickcred.javacor.O_exception.customexception.classes.Pessoa;

import java.io.FileNotFoundException;

public class sobrescritaComExceptionTeste {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        // (f.salvar) não vai gerar erro pois ele foi sobrescrito e não foi feita excesão nele
        f.salvar();
        // (p.salvar) é o item original que tem a excesão, e precisa de tratamento
        try {
            p.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
