package com.erickcred.javacor.O_exception.multiplasruntimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionsTeste {

    public static void main(String[] args) {
        try {
//            throw new ArrayIndexOutOfBoundsException();
//            throw new IllegalArgumentException();
//            throw new ArithmeticException();
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do Array IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) { // Todas acima são filhas de (Runtime) ela pode ser utilizada para todos uncheked
            System.out.println("Dentro da Exception");
        }

        // Melhor fazer dessa forma

        try {
            talvezLanceExcesao();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("\n-------------");
            System.out.println(e.getMessage());
            System.out.println("-------------");
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void talvezLanceExcesao() throws SQLException, FileNotFoundException {
        throw new SQLException();
    }
}
