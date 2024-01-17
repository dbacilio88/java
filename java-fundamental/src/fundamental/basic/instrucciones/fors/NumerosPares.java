package fundamental.basic.instrucciones.fors;

import java.util.Scanner;

public class NumerosPares {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        print(num);

    }

    private static void print(int num) {

        for (int i = 1; i <= num; i++) {
            /*if (i % 2 == 0) {
                System.out.println("El número: " + i + " es par");
            }
            if (i % 2 == 1) {
                System.out.println("El número: " + i + " es impar");
            }*/

            if (i % 2 == 0) {
                System.out.println("El número: " + i + " es par");
            } else {
                System.out.println("El número: " + i + " es impar");
            }

            //(true) ? a : b
            String result = (i % 2 == 0) ? i + " es par" : i + " es impar"; //operador ternario
            System.out.println("result = " + result);

        }

    }
}
