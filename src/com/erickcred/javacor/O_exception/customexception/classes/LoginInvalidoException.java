package com.erickcred.javacor.O_exception.customexception.classes;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("**|> Usuário ou Senha invalidos <|**");
    }
}
