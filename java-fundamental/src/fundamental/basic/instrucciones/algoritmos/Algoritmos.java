package fundamental.basic.instrucciones.algoritmos;

import java.util.Scanner;

public class Algoritmos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("num = " + num);
        int u = num % 10;
        int d = (num / 10) % 10;
        int c = (num / 100) % 10;
        int suma = (u * 100) + (d * 10) + c;
        System.out.println("suma = " + suma);
    }
}
