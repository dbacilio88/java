package com.bxcode.fundamental.types;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Primitivos {

    public static void main(String[] arg) {
        getCharacter();
        getFloat();
        getLong();
        getInt();
        getByte();
        getShort();
        getBoolean();
        getDouble();
    }

    private static void getCharacter() {
        char data = '\u00C1';
        log.info("character = {}", data);
    }

    private static void getDouble() {
        double number = -1.2d;
        log.info("getDouble = {}", number);
    }

    private static void getFloat() {
        float number = -1.2F;
        log.info("getFloat = {}", number);
    }

    private static void getLong() {
        //tipo de dato long: -9223372036854775808L, 9223372036854775807L
        long number = -9223372036854775808L;
        log.info("getLong = {}", number);
    }

    private static void getInt() {
        //tipo de dato int: -2147483648, 2147483647
        //23248516
        int number = -2147483648;
        log.info("getInt = {}", number);
    }

    private static void getShort() {
        //tipo de dato short: -32768, 32767
        short number = 32767;
        log.info("getShort = {}", number);
    }

    private static void getByte() {
        //tipo de dato byte: -128, 127
        byte number = 127;
        log.info("number = {}", number);
    }

    private static void getBoolean() {
        //tipo de dato boolean: false, true
        boolean isOpen = false;
        boolean isActive = false;
        log.info("isActive = {}", isActive);
        log.info("isOpen = {}", isOpen);
    }
}