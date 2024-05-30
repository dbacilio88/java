package com.bxcode.fundamental.poo.exceptions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Calculadora implements Operaciones {

    public static void main(String[] args) {
        boolean stop = true;
        Operaciones operaciones = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        String menu = "[1] sumar"
                + "\n[2] restar"
                + "\n[3] dividir"
                + "\n[4] multiplicar"
                + "\n[0] salir"
                + "\n\t Elegir opción:";

        while (stop) {
            Integer opc;
            do {
                log.info(menu);

                opc = Calculadora.parse(scanner.nextLine());
                log.info("opc = " + opc);
            } while (opc == null || opc > 5 || opc < 0);

            if (opc == 0) {
                log.info("Saliste del sistema");
                break;

            }

            Integer numA;
            Integer numB;
            do {
                log.info("Ingresa el primer numero: ");
                numA = Calculadora.parse(scanner.nextLine());
            } while (numA == null);

            do {
                log.info("Ingresa el segundo numero: ");
                numB = Calculadora.parse(scanner.nextLine());
            } while (numB == null);


            if (opc == 1) {
                double result = operaciones.sumar(numA, numB);
                operaciones.imprimir(result);
            }


        }


    }

    public static Integer parseSinException(String value) {

        return Integer.parseInt(value);
    }

    public static Integer parse(String value) {

        Integer result;
        try {
            result = Integer.parseInt(value);
        } catch (NumberFormatException e) {

            log.info("No se puede convertir un string a un integer");
            return null;
        }
        return result;
    }

    @Override
    public double sumar(int a, int b) {
        return (double) a + b;
    }

    @Override
    public double restar(int a, int b) {
        return 0;
    }

    @Override
    public double dividir(int a, int b) {
        return 0;
    }

    @Override
    public double multiplicar(int a, int b) {
        return 0;
    }

    @Override
    public void imprimir(double result) {
        log.info("result = " + result);
    }
}
