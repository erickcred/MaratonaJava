package com.erickcred.javacor.Q_wrappers.test;

public class WrappersTeste {

    public static void main(String[] args) {
        /*
            Temos 8 tipos primitivos de variáveis: primeiro começamos do menor para maior numérico
         */
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;


        /*
            Wrapper do tipo Primitivo => Objetos
         */
        // Autoboxing é pegar um tipo primitivo e colcar em um Wrapper
        Byte wrapperByte = 1;
        Short wrapperShort = 1;
        Integer wrapperInt = 10;
        Long wrapperLong = 10L;
        Float wrapperFloat = new Float("10"); // ele faz a conversão automaticamente para float mesmo sendo String
        Double wrapperDouble = 10D;
        Character wrapperChar = new Character('A');
        Boolean wrapperBoolean = new Boolean("TruE"); // ele é case insensitive

        System.out.println(wrapperBoolean);

        String valor = "10";
        Float f = Float.parseFloat(valor);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println("----------");
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetter('A'));
        System.out.println("-----------");
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        System.out.println("-----------");
        System.out.println(f);

        // Unboxing é: e o Java faz isso automaticamente
        int i  = wrapperInt.intValue(); // <- fazer isso é relativo
    }
}
