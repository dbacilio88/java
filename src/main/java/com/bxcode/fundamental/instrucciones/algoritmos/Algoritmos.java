package com.bxcode.fundamental.instrucciones.algoritmos;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Algoritmos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Ingresar un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        log.info("num = {}", num);
        int u = num % 10;
        int d = (num / 10) % 10;
        int c = (num / 100) % 10;
        int suma = (u * 100) + (d * 10) + c;
        log.info("suma = {}", suma);
    }
}
