package fundamental.basic.poo.exceptions;

import java.util.Scanner;

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
                System.out.println(menu);

                opc = Calculadora.parse(scanner.nextLine());
                System.out.println("opc = " + opc);
            } while (opc == null || opc > 5 || opc < 0);

            if (opc == 0) {
                System.out.println("Saliste del sistema");
                break;

            }

            Integer numA;
            Integer numB;
            do {
                System.out.print("Ingresa el primer numero: ");
                numA = Calculadora.parse(scanner.nextLine());
            } while (numA == null);

            do {
                System.out.print("Ingresa el segundo numero: ");
                numB = Calculadora.parse(scanner.nextLine());
            } while (numB == null);


            switch (opc) {
                case 1:
                    double result = operaciones.sumar(numA, numB);
                    operaciones.imprimir(result);
                    break;
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

            System.out.println("No se puede convertir un string a un integer");
            return null;
        }
        return result;
    }

    @Override
    public double sumar(int a, int b) {
        return a + b;
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
        System.out.println("result = " + result);
    }
}
