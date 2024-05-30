package com.bxcode.fundamental.instrucciones.ifs;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;


@Log4j2
public class NumeroMayor {

    public static void main(String[] args) {

        //10/0

        Scanner scanner = new Scanner(System.in);
        int numA = 0;
        int numB = 0;
        //proceso 1: ingresar información
        try {
            log.info("Ingresar número A: ");
            numA = Integer.parseInt(scanner.nextLine()); //"1234","54512","785ghh"
            log.info("Ingresar número B: ");
            numB = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            log.info("[Error]: {}", e.getMessage());
        }
        //proceso 2: validar información
        if (numA > numB) {
            log.info("Número A es mayor que B");
        } else if (numA == numB) {
            log.info("Número A = B");
        } else {
            log.info("Número B es mayor que A");
        }
    }
}
