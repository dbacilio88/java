package fundamental.basic.instrucciones.fors;

import java.util.Scanner;

public class Repetitivas {

    //la tabla de multiplicar: 1, [1-12]
    //generar números 1-100 y mostrar o imprimir números pares
    //generar números 1-100 y mostrar o imprimir números impares
    //generar números 1-100 y mostrar o imprimir números primos


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar tamaño de arreglo: ");
        int cant = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingresar numero inicial: ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingresar numero final: ");

        int end = Integer.parseInt(scanner.nextLine());
        int[] x = getArrays(cant, start, end);
        print(x);
    }


    /**
     * Método que genera un arreglo de enteros
     *
     * @param cant  = cantidad de elementos
     * @param start = número inicial
     * @param end   = número final
     * @return int[]
     */
    private static int[] getArrays(int cant, int start, int end) {
        int[] arr = new int[cant]; //declarar un arreglo de cant y de tipo entero
        for (int i = 0; i < arr.length; i++) { // para almacenar los datos en cada posición
            arr[i] = (int) (Math.random() * end + start);
        }
        return arr;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // para imprimir los datos del arreglo
            System.out.print("[" + arr[i] + "] ");
            System.out.print(" 1 x 1 = 2 ");
        }
        System.out.println();
    }
}
