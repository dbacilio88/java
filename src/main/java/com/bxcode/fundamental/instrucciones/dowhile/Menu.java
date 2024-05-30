package com.bxcode.fundamental.instrucciones.dowhile;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;


@Log4j2
public class Menu {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String menu = "[1] sumar\n"
                + "[2] restar \n"
                + "[3] multiplicar \n"
                + "[4] dividir \n"
                + "[0] salir \n";

        //while: repite una instrucción hasta que la condición sea falsa, si es que es verdadera se sigue ejecutando
        //do while ejecuta la primera acción, si es que es verdadera se sigue ejecutando

        int i = 0;

        boolean close = true;

        while (close) {
            Integer opc;
            Integer numA;
            Integer numB;

            do {
                log.info(menu);
                log.info("Ingrese una opción: ");
                opc = Integer.parseInt(scanner.nextLine());
            } while (opc == null || opc > 4 || opc < 0);

            if (opc == 0) {
                log.info("ud salio de la calculadora");
                break;
            }

            do {
                log.info("Ingresar el primer número: ");
                numA = Integer.parseInt(scanner.nextLine());
            } while (numA == null);
            do {
                log.info("Ingresar el segundo número: ");
                numB = Integer.parseInt(scanner.nextLine());
            } while (numB == null);

            switch (opc) {
                case 1:
                    int suma = numA + numB;
                    log.info("la Suma de A y B = " + suma);
                    break;
                case 2:
                    int resta = numA - numB;
                    log.info("la Resta de A y B = " + resta);
                    break;
                case 3:
                    int producto = numA * numB;
                    log.info("la Multiplicación de A y B = {}", producto);
                    break;
                case 4:
                    int division = numA / numB;
                    log.info("la División de A y B = {}", division);
                    break;
                default:
                    break;
            }
            i++;
            log.info("i = {}", i);
        }

        log.info("close = {}", close);

    }
}
