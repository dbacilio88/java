package fundamental.basic.instrucciones.fors;

import java.util.Scanner;

public class Multiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero de la tabla: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresar la cantidad : ");
        int cant = Integer.parseInt(scanner.nextLine());
        print(num, cant);

    }

    private static void print(int num, int cant) {

        for (int i = 1; i <= cant; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }

    }

}
