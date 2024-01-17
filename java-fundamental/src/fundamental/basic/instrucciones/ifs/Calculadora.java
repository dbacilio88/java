package fundamental.basic.instrucciones.ifs;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar número A: ");
        int numA = Integer.parseInt(scanner.nextLine()); //"1234","54512","785ghh"
        System.out.println("Ingresar número B: ");
        int numB = Integer.parseInt(scanner.nextLine());
        dividir(numA, numB);
        sumar(numA, numB);
        restar(numA, numB);
        multiplicar(numA, numB);


    }

    private static void sumar(int a, int b) {
        int sumar = a + b;
        System.out.println("sumar = " + sumar);
    }

    private static void restar(int a, int b) {
        int restar = a - b;
        System.out.println("restar = " + restar);
    }

    private static void multiplicar(int a, int b) {
        int multiplicar = a * b;
        System.out.println("multiplicar = " + multiplicar);
    }

    private static void dividir(int a, int b) {

        try {
            int dividir =  a / b;
            System.out.println("dividir = " + dividir);
        } catch (ArithmeticException e) {
            System.out.println(a + " No se puede dividir entre cero");
        }

    }
}
