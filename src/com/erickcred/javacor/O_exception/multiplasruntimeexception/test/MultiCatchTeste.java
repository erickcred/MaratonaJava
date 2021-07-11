package com.erickcred.javacor.O_exception.multiplasruntimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchTeste {

    public static void main(String[] args) {
        try {
            talvezLanceExcesao();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            System.out.println("\n------+------");
            System.out.println(e.getMessage());
        }
    }

    private static void talvezLanceExcesao() throws SQLException, FileNotFoundException {
        throw new SQLException();
    }
}
