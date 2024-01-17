package fundamental.basic.instrucciones.ifs;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {

        //10/0

        Scanner scanner = new Scanner(System.in);
        int numA = 0;
        int numB = 0;
        //proceso 1: ingresar información
        try {
            System.out.println("Ingresar número A: ");
            numA = Integer.parseInt(scanner.nextLine()); //"1234","54512","785ghh"
            System.out.println("Ingresar número B: ");
            numB = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("[Error]: " + e.getMessage());
        }
        //proceso 2: validar información
        if (numA > numB) {
            System.out.println("Número A es mayor que B");
        } else if (numA == numB) {
            System.out.println("Número A = B");
        } else {
            System.out.println("Número B es mayor que A");
        }
    }
}
