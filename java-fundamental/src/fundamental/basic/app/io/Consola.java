package fundamental.basic.app.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Consola
 * <p>
 * Consola class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author bxcode
 * @author bacsystem.sac@gmail.com
 * @since 13/02/2024
 */
public class Consola {

    public Consola() {

    }

    public static String getString(String mensaje) {
        System.out.print(mensaje);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = null;
        try {
            data = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public static Integer getInteger(String mensaje) {
        System.out.print(mensaje);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer data = null;
        try {
            String m = br.readLine();
            data = Integer.valueOf(m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }


    public static String getMenu() {
        return "[1] listar personas" +
                "\n[2] registrar persona" +
                "\n[3] actualizar persona" +
                "\n[4] eliminar persona" +
                "\n[0] salir del programa" +
                "\n\t[*] elegir opción:";
    }

    public static void main(String[] args) {
        Integer opcion = Consola.getInteger(getMenu());
        System.out.println(opcion);
    }
}


