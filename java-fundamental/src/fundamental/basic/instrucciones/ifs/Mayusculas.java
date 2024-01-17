package fundamental.basic.instrucciones.ifs;

import java.util.Scanner;

public class Mayusculas {
    public static void main(String[] args) {

        //123
        //321

        //tipo de dato: char => primitivo
        //tipo de dato: Character => wrapper
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un texto: ");
        String cadena = scanner.nextLine();
        System.out.println("cadena = " + cadena.length());
        char[] arr = cadena.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                System.out.println(arr[i] + " Es mayúscula");
            }
        }

    }
}
