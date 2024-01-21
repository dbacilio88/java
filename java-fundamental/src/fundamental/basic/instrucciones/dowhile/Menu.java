package fundamental.basic.instrucciones.dowhile;

import java.util.Scanner;

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
            Integer opc, numA, numB;

            do {
                System.out.println(menu);
                System.out.println("Ingrese una opción: ");
                opc = Integer.parseInt(scanner.nextLine());
            } while (opc == null || opc > 4 || opc < 0);

            if (opc == 0) {
                System.out.println("ud salio de la calculadora");
                break;
            }

            do {
                System.out.println("Ingresar el primer número: ");
                numA = Integer.parseInt(scanner.nextLine());
            } while (numA == null);
            do {
                System.out.println("Ingresar el segundo número: ");
                numB = Integer.parseInt(scanner.nextLine());
            } while (numB == null);

            switch (opc) {
                case 1:
                    int suma = numA + numB;
                    System.out.println("la Suma de A y B = " + suma);
                    break;
                case 2:
                    int resta = numA - numB;
                    System.out.println("la Resta de A y B = " + resta);
                    break;
                case 3:
                    int producto = numA * numB;
                    System.out.println("la Multiplicación de A y B = " + producto);
                    break;
                case 4:
                    int division = numA / numB;
                    System.out.println("la División de A y B = " + division);
                    break;
            }
            i++;
            System.out.println("i = " + i);
        }

        System.out.println("close = " + close);

    }
}
