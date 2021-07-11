package com.erickcred.javacor.O_exception.customexception.test;

import com.erickcred.javacor.O_exception.customexception.classes.LoginInvalidoException;

import java.util.Scanner;

public class CustomExceptionTeste {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);

        String usuario = "goku";
        String senha = "1234";

        System.out.print("Login: ");
        String user = sc.next();
        System.out.print("Senha: ");
        String pass = sc.next();

        if ((!user.equals(usuario)) || !pass.equals(senha)) {
            throw new LoginInvalidoException();
        }
        System.out.println("Seja bem vindo "+ usuario);

    }
}
